package com.guiyunli.rxjava;

import java.util.HashMap;

/**
 * @Author Li Gui Yun
 * @date 2019年01月17日16:50
 * @email guiyun.li@aihuishou.com
 **/
public class Test {

    public static void main(String[] args) {
        int[] numbers = {0, 5, 1, 6, 7, 87, 6, 8, 1, 4};
        int high = 9, low = 9;
        int mid = high / 2 + low / 2;
        System.out.println("数据" + mid);
    }


    /**
     * 冒泡排序就是 让数组的第一位 到最后一位  一次类推进行对比 如果第N个数字i给后面数字j进行对比 如果i>j i和j就行交换为位置
     * 以此类推 循环次数是 f(n)=0+1+2+3..+n  如果数字为100W 用这种方式将是灾难
     */
    private void bubbleSort() {
        int[] numbers = {0, 5, 1, 6, 7, 87, 6, 8, 1, 4};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] >= numbers[j]) {
                    int flag = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = flag;
                }
            }
        }
        for (int number : numbers) {
            System.out.println("数字" + number);
        }
    }

    /**
     * 选择排序  根据 0..n进行数字比对，找到最小的那个数字 给第一个进行比对，最小的数字不是当前位置的数字，就进行交换数字 以此类推
     */
    private void selectSort() {
        int[] numbers = {0, 5, 1, 6, 7, 87, 6, 8, 1, 4};
        for (int i = 0; i < numbers.length; i++) {
            int n = numbers[i];
            int position = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < n) {
                    n = numbers[j];
                    position = j;
                }
            }
            if (position != i) {
                int flag = numbers[position];
                numbers[position] = numbers[i];
                numbers[i] = flag;
            }
        }
        for (int m = 0; m < numbers.length; m++) {
            System.out.println("数据" + numbers[m]);
        }
    }

    /**
     * 插入排序  就是左边是排序好的  右边是凌乱的从右边取出一个值 在右边进行对比 让在合适的位置
     */
    private static void insertSort() {
        int[] numbers = {0, 5, 1, 6, 7, 87, 6, 8, 1, 4};
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (numbers[j] < numbers[j - 1]) {
                    int flag = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = flag;
                }
            }
        }
        for (int m = 0; m < numbers.length; m++) {
            System.out.println("数据" + numbers[m]);
        }
    }

    /**
     * 哈希排序   首先把一个数组分成若干这个数组，对分割的数组进行 插入排序， 然后合并数据， 从第一个数组到N个数字 从小到达合并 然后 数组数量/3+1 在分割 若干个数组 在合并
     * <p>
     * 不如数组长度为N
     * <p>
     * 1，分成数组是 increment=N/3+1   increment 是增长因子
     * 2，对分割成数组进行排序，在合并一个数组  合并方法是 几个数组最小的开始排 以此类推
     * 3，在进行数组分割 increment=increment/3+1 对分割的数组在进行插入排序，然后像第二步 一样合并成一个数组
     * 4，当increment=1的时候对整个数组进行排序
     */
    private static void shellSort() {
        int[] numbers = {0, 5, 1, 6, 7, 87, 6, 8, 1, 4};
        int increment = numbers.length + 1;
        do {
            increment = increment / 3 + 1;
            for (int i = increment; i < numbers.length; ++i) {
                if (numbers[i - increment] > numbers[i]) {//如果前面大于后面的就进行置换
                    int j = i - increment;
                    int flag = numbers[i];
                    do {
                        numbers[j + increment] = numbers[j];
                        j -= increment;
                    } while (j > 0 && numbers[j] > flag);
                    numbers[j + increment] = flag;
                }
            }
        } while (increment > 1);

        for (int m = 0; m < numbers.length; m++) {
            System.out.println("数据" + numbers[m]);
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        // low,high 为每次处理数组时的首、尾元素索引

        //当low==high是表示该序列只有一个元素，不必排序了
        if (low >= high) {
            return;
        }
        // 选出哨兵元素和基准元素。这里左边的哨兵元素为第2个元素（第一个为基准元素）
        int i = low, j = high, base = arr[low];
        while (i < j) {
            //右边哨兵从后向前找
            while (arr[j] >= base && i < j) {
                j--;
            }
            //左边哨兵从前向后找
            while (arr[i] <= base && i < j) {
                i++;
            }
            swap(arr, i, j);  //交换元素
        }
        swap(arr, low, i);  //基准元素与右哨兵交换
        //递归调用，排序左子集合和右子集合
        quickSort(arr, low, j - 1);
        quickSort(arr, j + 1, high);

    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private static void quickSort(int[] arrays) {
        subQuickSort(arrays, 0, arrays.length - 1);
    }

    private static void subQuickSort(int[] arrays, int start, int end) {
        if (start >= end) {
            return;
        }
        int middleIndex = subQuickSortCore(arrays, start, end);
        subQuickSort(arrays, start, middleIndex - 1);
        subQuickSort(arrays, middleIndex + 1, end);
    }

    private static int subQuickSortCore(int[] arrays, int start, int end) {
        int middleValue = arrays[start];
        while (start < end) {
            while (arrays[end] >= middleValue && start < end) {
                end--;
            }
            arrays[start] = arrays[end];
            while (arrays[start] <= middleValue && start < end) {
                start++;
            }
            arrays[end] = arrays[start];
        }
        arrays[start] = middleValue;
        return start;
    }
}
