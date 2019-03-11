package com.guiyunli.algorithm;

/**
 * @Author Li Gui Yun
 * @date 2019年03月06日15:12
 * @email guiyun.li@aihuishou.com
 **/
public class Algorithm {

    private static int[] number = {6, 2, 9, 8, 51, 0, 565, 56, 42, 6, 96, 30, 452};

    public static void main(String[] args) {
        //quickSort(0, number.length - 1);
        insertSort();
        for (int i : number
                ) {
            System.out.println("数据" + i);
        }
    }

    /**
     * @param left
     * @param right
     */
    private static void quickSort(int left, int right) {
        if (left > right) {
            return;
        }
        int temp = number[left];
        int i = left;
        int j = right;
        //当右边从右向左进行查找  找到 比 基准数小的位置  切 右边的位置一定要的大于左边的位置
        while (number[j] >= temp && i < j) {
            j--;
        }
        //从左边像右边进行查找  找到 比基准数大的位置 切 右边的位置一定要大于左边的位置
        while (number[i] <= temp && i < j) {
            i++;
        }
        //如果 左边查找到的位置小于右边的 就进行交换
        if (i < j) {
            swapNumber(i, j);
        }
        swapNumber(left, i);
        quickSort(left, i - 1);
        quickSort(i + 1, right);
    }


    /**
     * 从左到右进行对比 左边的数据都是排序好的 当你找到合适的位置 就插入进去
     */
    private static void insertSort() {
        for (int i = 1; i < number.length; i++) {
            int j = i;
            //先判断 前一个 如果大于后一个 就进行置换，直到最后前后两个数字相等或者小于
            while (0 < j && number[j] <= number[j - 1]) {
                swapNumber(j-1, j);
                j--;
            }
        }
    }


    private static void swapNumber(int i, int j) {
        int flag = number[i];
        number[i] = number[j];
        number[j] = flag;
    }

}
