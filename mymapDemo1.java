package myMap;

import java.util.HashMap;
import java.util.Map;

public class mymapDemo1 {
    public static void main(String[] args) {
        /*
         * ========== HashMap 和哈希表原理 ==========
         * 
         * 哈希表是什么？
         * - 一种高效的数据结构，通过哈希函数快速定位数据
         * - 核心思想：键 → 哈希函数 → 数组索引 → 存储位置
         * 
         * 工作原理示例：
         * 键："郭靖"  → 哈希函数计算 → 索引：3  → 存储在数组[3]
         * 键："韦小宝" → 哈希函数计算 → 索引：7  → 存储在数组[7]
         * 
         * 哈希表结构（内部数组）：
         * ┌─────────────────────────────────┐
         * │ [0] → null                      │
         * │ [1] → null                      │
         * │ [2] → null                      │
         * │ [3] → 郭靖=黄蓉                 │
         * │ [4] → null                      │
         * │ [5] → null                      │
         * │ [6] → null                      │
         * │ [7] → 韦小宝=苏建平             │
         * │ [8] → null                      │
         * └─────────────────────────────────┘
         * 
         * 性能对比：
         * - 普通数组查找：O(n) - 需要遍历整个数组
         * - 哈希表查找：O(1) - 直接定位，非常快
         * 
         * Map 常用方法：
         * - V put(K key, V value) - 添加键值对，返回旧值
         * - V remove(Object key) - 删除指定键，返回对应的值
         * - void clear() - 清空所有键值对
         * - boolean containKey(Object key) - 判断是否包含指定键
         * - boolean isEmpty() - 判断是否为空
         * - int size() - 返回键值对个数
         */

        Map<String, String> m = new HashMap<>();  // 创建 HashMap（基于哈希表实现）

        // put() 方法：添加键值对
        // 第一次添加 "郭靖" 键，不存在旧值，所以返回 null
        // 内部过程：
        // 1. 计算 "郭靖" 的哈希值
        // 2. 根据哈希值计算数组索引（假设为 3）
        // 3. 在数组[3]位置存储键值对
        // 4. 返回旧值（null，因为是第一次）
        String value1 = m.put("郭靖", "黄蓉");
        System.out.println(value1);  // 输出：null

        // 添加第二个键值对
        // 内部过程：
        // 1. 计算 "韦小宝" 的哈希值
        // 2. 根据哈希值计算数组索引（假设为 7）
        // 3. 在数组[7]位置存储键值对
        m.put("韦小宝", "苏建平");

        // 打印整个 HashMap
        // 输出：{郭靖=黄蓉, 韦小宝=苏建平}
        // 注意：HashMap 中的键值对顺序不一定按添加顺序排列
        System.out.println(m);
    }
}
