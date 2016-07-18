/*
 * 鏂囦欢鍚嶏細DirectSelectSort.java
 * 鐗堟潈锛欳opyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 鎻忚堪锛� DirectSelectSort.java
 * 淇敼浜猴細duanji
 * 淇敼鏃堕棿锛�2016骞�2鏈�16鏃�
 * 淇敼鍐呭锛氭柊澧�
 */
package com.better517na.demo.algorithm.sort;

/**
 * 鐩存帴閫夋嫨鎺掑簭鐨勯潤鎬佸疄鐜板拰娴嬭瘯.
 * 
 * @author duanji
 */
public class HeapSelectSort {

    public static void main(String[] args) {
        int[] data5 = new int[]{49, 38, 65, 97, 76, 49, 13, 27, 49, 78, 34, 12, 64, 1, 8};
        data5 = new int[]{25};
        data5 = new int[]{25, 12};
        data5 = new int[]{};
        print(data5);
        heapSort(data5, data5.length);
        System.out.println("排序后的数组：");
        print(data5);
    }

    public static void swap(int[] arr, int a, int b) {
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void BuildHeap(int[] a, int size) // 建立堆
    {
        int i;
        for (i = (size - 2) / 2; i >= 0; i--) // 非叶节点最大序号值为size/2
        {
            HeapAdjust(a, i, size);
        }
    }

    public static void heapSort(int[] a, int size) // 堆排序
    {
        if (size == 1) {
            return;
        }
        int i;
        BuildHeap(a, size);
        for (i = size - 1; i >= 0; i--) {
            // cout<<a[1]<<" ";
            swap(a, 0, i); // 交换堆顶和最后一个元素，即每次将剩余元素中的最大者放到最后面
            // BuildHeap(a,i-1); //将余下元素重新建立为大顶堆
            HeapAdjust(a, 0, i - 1); // 重新调整堆顶节点成为大顶堆
        }
    }

    public static void HeapAdjust(int[] a, int i, int size) // 调整堆
    {
        int lchild = 2 * i; // i的左孩子节点序号
        int rchild = 2 * i + 1; // i的右孩子节点序号
        int max = i; // 临时变量
        if (i <= (size - 2) / 2) // 如果i是叶节点就不用进行调整
        {
            if (lchild <= size && a[lchild] > a[max]) {
                max = lchild;
            }
            if (rchild <= size && a[rchild] > a[max]) {
                max = rchild;
            }
            if (max != i) {
                swap(a, i, max);
                HeapAdjust(a, max, size); // 避免调整之后以max为父节点的子树不是堆
            }
        }
    }

    public static void print(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
        System.out.println();
    }

    public static void show(int[] arr) {
        System.out.println("number:" + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
