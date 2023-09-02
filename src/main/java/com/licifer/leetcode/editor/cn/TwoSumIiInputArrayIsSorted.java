/**
 * <p>给你一个下标从 <strong>1</strong> 开始的整数数组&nbsp;<code>numbers</code> ，该数组已按<strong><em> </em>非递减顺序排列&nbsp; </strong>，请你从数组中找出满足相加之和等于目标数&nbsp;<code>target</code> 的两个数。如果设这两个数分别是
 * <code>numbers[index<sub>1</sub>]</code> 和 <code>numbers[index<sub>2</sub>]</code> ，则 <code>1 &lt;= index<sub>1</sub> &lt; index<sub>2</sub> &lt;= numbers.length</code> 。</p>
 *
 * <p>以长度为 2 的整数数组 <code>[index<sub>1</sub>, index<sub>2</sub>]</code> 的形式返回这两个整数的下标 <code>index<sub>1</sub></code><em> </em>和<em> </em><code>index<sub>2</sub></code>。</p>
 *
 * <p>你可以假设每个输入 <strong>只对应唯一的答案</strong> ，而且你 <strong>不可以</strong> 重复使用相同的元素。</p>
 *
 * <p>你所设计的解决方案必须只使用常量级的额外空间。</p> &nbsp;
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>numbers = [<strong><em>2</em></strong>,<strong><em>7</em></strong>,11,15], target = 9
 * <strong>输出：</strong>[1,2]
 * <strong>解释：</strong>2 与 7 之和等于目标数 9 。因此 index<sub>1</sub> = 1, index<sub>2</sub> = 2 。返回 [1, 2] 。</pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>numbers = [<strong><em>2</em></strong>,3,<strong><em>4</em></strong>], target = 6
 * <strong>输出：</strong>[1,3]
 * <strong>解释：</strong>2 与 4 之和等于目标数 6 。因此 index<sub>1</sub> = 1, index<sub>2</sub> = 3 。返回 [1, 3] 。</pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>numbers = [<strong><em>-1</em></strong>,<strong><em>0</em></strong>], target = -1
 * <strong>输出：</strong>[1,2]
 * <strong>解释：</strong>-1 与 0 之和等于目标数 -1 。因此 index<sub>1</sub> = 1, index<sub>2</sub> = 2 。返回 [1, 2] 。
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * <li><code>2 &lt;= numbers.length &lt;= 3 * 10<sup>4</sup></code></li>
 * <li><code>-1000 &lt;= numbers[i] &lt;= 1000</code></li>
 * <li><code>numbers</code> 按 <strong>非递减顺序</strong> 排列</li>
 * <li><code>-1000 &lt;= target &lt;= 1000</code></li>
 * <li><strong>仅存在一个有效答案</strong></li>
 * </ul>
 *
 * <details><summary><strong>Related Topics</strong></summary>数组 | 双指针 | 二分查找</details><br>
 *
 * <div>👍 1120, 👎 0<span style='float: right;'><span style='color: gray;'>
 *     <a href='https://github.com/labuladong/fucking-algorithm/discussions/939' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a>
 *     | <a href='https://labuladong.gitee.io/article/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a>
 *     | <a href='https://labuladong.github.io/algo/images/others/%E5%85%A8%E5%AE%B6%E6%A1%B6.jpg' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a>
 *     </span></span></div>
 */

package com.licifer.leetcode.editor.cn;

/**
 * 解题思路:利用左右指针移动，这种类似于二分查找，如果是有序数组的话，都可以考虑一下左右指针
 * 重点：
 * 1.左右指针的定位要确定清楚
 * 2.如果答案在最左边或者最右边，那么需要遍历整个数组才能找到答案，这点还可以优化，放在二刷再解决吧。
 */
public class TwoSumIiInputArrayIsSorted {
    public static void main(String[] args) {
        Solution solution = new TwoSumIiInputArrayIsSorted().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] numbers, int target) {

            int left = 0, right = numbers.length - 1;
            while (left <= right) {
                int sum = numbers[left] + numbers[right];
                if (sum == target) {
                    return new int[]{left + 1, right + 1};
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
            return new int[]{-1, -1};

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}