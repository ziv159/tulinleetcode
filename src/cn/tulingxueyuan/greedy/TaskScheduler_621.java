package cn.tulingxueyuan.greedy;

/**
 * @author ：Mark老师
 * @description ：(LeetCode-621) 任务调度器
 * 给你一个用字符数组 tasks 表示的 CPU 需要执行的任务列表。
 * 其中每个字母表示一种不同种类的任务。任务可以以任意顺序执行，
 * 并且每个任务都可以在 1 个单位时间内执行完。
 * 在任何一个单位时间，CPU 可以完成一个任务，或者处于待命状态。
 * 然而，两个 相同种类 的任务之间必须有长度为整数 n 的冷却时间，
 * 因此至少有连续 n 个单位时间内 CPU 在执行不同的任务，或者在待命状态。
 * 你需要计算完成所有任务所需要的 最短时间 。
 */
public class TaskScheduler_621 {

    public int leastInterval(char[] tasks, int n) {
        int[] arr = new int[26];
        /*统计各个字母出现的次数*/
        for (char c : tasks) {
            arr[c - 'A']++;
        }
        int max = 0;
        /*找到最大次数*/
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        int ret = (max - 1) * (n + 1);
        /*寻找最大次数相同的字母个数，然后累加进ret*/
        for (int i = 0; i < 26; i++) {
            if (arr[i] == max) {
                ret++;
            }
        }
        /*在tasks的长度和ret中取较大的一个*/
        return Math.max(ret, tasks.length);
    }

}
