package algorithm;

public class SortMethod {

	public static void main(String[] args) {
		int[] numbers = { 6, 1, 2, 7, 9, 3, 4, 5, 10, 8 };
		// quickSort(numbers, 0, numbers.length-1);
		// insertSort(numbers);
//		shellSort(numbers);
//		mergeSort(numbers, 0, numbers.length - 1);
//		heapSortAsc(numbers, numbers.length); 
		
		printArr(numbers);
	}

	
	/** 
     * (最大)堆的向下调整算法
     *
     * 注：数组实现的堆中，第N个节点的左孩子的索引值是(2N+1)，右孩子的索引是(2N+2)。
     *     其中，N为数组下标索引值，如数组中第1个数对应的N为0。
     *
     * 参数说明：
     *     a -- 待排序的数组
     *     start -- 被下调节点的起始位置(一般为0，表示从第1个开始)
     *     end   -- 截至范围(一般为数组中最后一个元素的索引)
     */
    public static void maxHeapDown(int[] a, int start, int end) {
        int c = start;            // 当前(current)节点的位置
        int l = 2*c + 1;        // 左(left)孩子的位置
        int tmp = a[c];            // 当前(current)节点的大小

        for (; l <= end; c=l,l=2*l+1) {
            // "l"是左孩子，"l+1"是右孩子
            if ( l < end && a[l] < a[l+1])
                l++;        // 左右两孩子中选择较大者，即m_heap[l+1]
            
            if (tmp < a[l]) { // 交换值
                a[c] = a[l];
                a[l]= tmp;
            }
        }
    }

    /**
     * 堆排序(从小到大)
     *
     * 参数说明：
     *     a -- 待排序的数组
     *     n -- 数组的长度
     */
    public static void heapSortAsc(int[] a, int n) {
        int i,tmp;

        // 从(n/2-1) --> 0逐次遍历。遍历之后，得到的数组实际上是一个(最大)二叉堆。
        for (i = n / 2 - 1; i >= 0; i--)
            maxHeapDown(a, i, n-1);

        // 从最后一个元素开始对序列进行调整，不断的缩小调整的范围直到第一个元素
        for (i = n - 1; i > 0; i--) {
            // 交换a[0]和a[i]。交换后，a[i]是a[0...i]中最大的。
            tmp = a[0];
            a[0] = a[i];
            a[i] = tmp;
            // 调整a[0...i-1]，使得a[0...i-1]仍然是一个最大堆。
            // 即，保证a[i-1]是a[0...i-1]中的最大值。
            maxHeapDown(a, 0, i-1);
        }
    }
	
	/**
	 * 归并排序是建立在归并操作上的一种有效的排序算法。该算法是采用分治法（Divide and Conquer）的一个非常典型的应用.
	 * 通常用递归实现，先把待排序区间[s,t]以中点二分，接着把左边子区间排序，
	 * 再把右边子区间排序，最后把左区间和右区间用一次归并操作合并成有序的区间[s,t]。
	 * 一般情况下不断的将数组以中点拆分，直到只有一个元素的时候就可以这个小组已经是有序的。
	 * 
	 * 分治法的三个步骤是： ①分解：将当前区间一分为二，即求分裂点
	 * ②求解：递归地对两个子区间R[low..mid]和R[mid+1..high]进行归并排序；
	 * ③组合：将已排序的两个子区间R[low..mid]和R[mid+1..high]归并为一个有序的区间R[low..high]。
	 * 递归的终结条件：子区间长度为1（一个记录自然有序）。
	 * 
	 * 将有二个有序数列a[first...mid]和a[mid...last]合并。
	 */
	
	public static void mergeSort(int a[], int first, int last) {
		if (first < last) {
			
			int mid = (first + last) / 2; // 首先找出中间的索引	
			mergeSort(a, first, mid); // 左边有序
			mergeSort(a, mid + 1, last); // 右边有序
			merge(a, first, mid, last); // 再将二个有序数列合并
		}
	}
	
	public static void merge(int a[], int first, int mid, int last) {
		int i = first, j = mid + 1;
		int m = mid, n = last;
		int k = first;

		// 存放两个序列归并后的结果
		int temp[] = new int[a.length];
		while (i <= m && j <= n) {
			if (a[i] <= a[j]) {
				temp[k++] = a[i++];
			} else {
				temp[k++] = a[j++];
			}
		}

		while (i <= m)
			temp[k++] = a[i++];

		while (j <= n)
			temp[k++] = a[j++];

		int tmp = first;
		 while (tmp <= last) {
	            a[tmp] = temp[tmp++];
	        }
		

	}


	/**
	 * 希尔排序的原理:根据需求，如果你想要结果从大到小排列， 它会首先将数组进行分组，然后将较大值移到前面，较小值
	 * 移到后面，最后将整个数组进行插入排序， 这样比起一开始就用插入排序减少了数据交换和移动的次数，可以说希尔排序是加强 版的插入排序
	 */
	public static void shellSort(int[] numbers) {
		int gap = 0, temp = 0;
		while (gap < numbers.length / 3)
			gap = gap * 3 + 1; // <O(n^(3/2)) by Knuth,1973>: 1, 4, 13, 40, 121,
								// ...

		for (; gap > 0; gap = gap / 3) {
			for (int i = gap; i < numbers.length; i++) {
				temp = numbers[i];
				for (int j = i; j - gap >= 0 && numbers[j - gap] > temp; j -= gap) {
					numbers[j] = numbers[j - gap];
					numbers[j - gap] = temp;
				}

			}
		}
	}

	/**
	 * 插入排序 
	 * 1.从第一个元素开始，该元素可以认为已经被排序
	 * 2.取出下一个元素，在已经排序的元素序列中从后向前扫描 
	 * 3.如果该元素（已排序）大于新元素，将该元素移到下一位置 
	 * 4.重复步骤3，直到找到已排序的元素小于或者等于新元素的位置,将新元素插入到该位置中
	 * 重复步骤2
	 * 
	 * @param numbers
	 *            待排序数组
	 */
	public static void insertSort(int[] numbers) {

		int temp = 0;
		for (int i = 1; i < numbers.length; i++) {
			temp = numbers[i];
			for (int j = i; j > 0; j--) {
				if (numbers[j - 1] > numbers[j]) {
					numbers[j] = numbers[j - 1];
					numbers[j - 1] = temp;
				} else {
					break;
				}

			}

		}
	}

	/**
	 * 快速排序算法思路
	 * 1、先定义一个基准数 假设为M
	 * 2、将基准数挪到序列中的某个位置，假设这个位置是k，并以k为临界点，比k小的在左边，比k大的在右边
	 * 3、定义两个哨兵分别从序列的两端开始探测，从右到左找一个小于M的数，从左到右找一个大于M的数。然后交换他们两
	 * 4、当两个哨兵碰头时，也就是K的正确位置
	 * 5、接着在从left-k以及k-right继续查找
	 * 
	 * @author Richard
	 *
	 */
	public static void quickSort(int[] numbers, int left, int right) {
		int i, j, t, temp;
		if (left > right) {
			return;
		}

		// 设立基准数
		temp = numbers[left];
		i = left;
		j = right;

		while (i != j) {

			// 顺序很重要，要先从右往左找
			while (numbers[j] >= temp && i < j) {
				j--;
			}

			// 再从左往右找
			while (numbers[i] <= temp && i < j) {
				i++;
			}

			if (i < j) {
				t = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = t;
			}
		}

		// 最终将基准数归位
		numbers[left] = numbers[i];
		numbers[i] = temp;

		quickSort(numbers, left, i - 1);// 继续处理左边的，这里是一个递归的过程
		quickSort(numbers, i + 1, right);// 继续处理右边的，这里是一个递归的过程

	}

	/**
	 * 冒泡排序的算法实现:【排序后，数组从小到大排列】 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
	 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。 针对所有的元素重复以上的步骤，除了最后一个。
	 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
	 * 
	 * @param numbers
	 *            需要排序的整型数组
	 */
	public void bubbleSort(int[] numbers) {
		int maxNum = 0;
		int flag = 0;

		for (int i = 0; i < numbers.length - 1; i++) {
			maxNum = numbers[0];
			flag = 0;
			for (int j = 0; j < numbers.length - i - 1; j++) {
				if (maxNum > numbers[j + 1]) {
					maxNum = numbers[j + 1];
					flag = j + 1;
				}

				// 堆内存中数组交换位置相对消耗性能，确保每轮只交换一次。
				if (j == numbers.length - i - 1) {
					numbers[flag] = numbers[numbers.length - i - 1];
					numbers[numbers.length - i - 1] = maxNum;
				}
			}
		}

	}

	/**
	 * 打印数组
	 * 
	 * @param numbers
	 */
	public static void printArr(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + ",");
		}
		System.out.println("");
	}
}
