import java.text.DecimalFormat;
import java.util.Random;


public class SortTest {

	public static int[] random(int size){
		Random r = new Random();
		int[] array = new int[size];
		for (int i = 0; i < size; i++)
			array[i]= r.nextInt(100);
		return array;
	}

	public static LLNode randomLL(int size){
		Random r = new Random();
		LLNode list = new LLNode(r.nextInt(100));
		LLNode temp = list;

		for (int i = 0; i < size - 1; i++){
			temp.setNext(new LLNode(r.nextInt(100)));
			temp  = temp.next();
		}
		return list;
	}


	static public void time_mergeSort(int listsize, int numiter, boolean reversed) {
		long startTime, endTime;
		Random randomGenerator = new Random();
		Sort sorter = new Sort();
		double duration;
		double subdur;
		int[] list = new int[listsize];

		startTime = System.currentTimeMillis();
		for(int i = 0; i < numiter; i++) {
			for (int j = 0; j < listsize; j++)
				list[j] = randomGenerator.nextInt();
			sorter.mergeSort(list, 0, listsize - 1, reversed);
		}

		endTime = System.currentTimeMillis();
		duration = ((double) (endTime - startTime)) / numiter;

		startTime = System.currentTimeMillis();
		for(int i = 0; i < numiter; i++) {
			for (int j = 0; j < listsize; j++)
				list[j] = randomGenerator.nextInt();
		}
		endTime = System.currentTimeMillis();
		subdur = ((double) (endTime - startTime)) / numiter;

		DecimalFormat df = new DecimalFormat("#.####");
		System.out.println("mergeSort---- listsize: " + listsize + " duration: " + df.format((duration - subdur)) + " milliseconds");
	}

	static public void time_insertionSort(int listsize, int numiter, boolean reversed) {
		long startTime, endTime;
		Random randomGenerator = new Random();
		Sort sorter = new Sort();
		double duration;
		double subdur;
		int[] list = new int[listsize];

		startTime = System.currentTimeMillis();
		for(int i = 0; i < numiter; i++) {
			for (int j = 0; j < listsize; j++)
				list[j] = randomGenerator.nextInt();
			sorter.insertionSort(list, 0, listsize - 1, reversed);
		}

		endTime = System.currentTimeMillis();
		duration = ((double) (endTime - startTime)) / numiter;

		startTime = System.currentTimeMillis();
		for(int i = 0; i < numiter; i++) {
			for (int j = 0; j < listsize; j++)
				list[j] = randomGenerator.nextInt();
		}
		endTime = System.currentTimeMillis();
		subdur = ((double) (endTime - startTime)) / numiter;

		DecimalFormat df = new DecimalFormat("#.####");
		System.out.println("insertionSort---- listsize: " + listsize + " duration: " + df.format((duration - subdur)) + " milliseconds");
	}


	static public void time_shellSort(int listsize, int numiter, boolean reversed) {
		long startTime, endTime;
		Random randomGenerator = new Random();
		Sort sorter = new Sort();
		double duration;
		double subdur;
		int[] list = new int[listsize];

		startTime = System.currentTimeMillis();
		for(int i = 0; i < numiter; i++) {
			for (int j = 0; j < listsize; j++)
				list[j] = randomGenerator.nextInt();
			sorter.shellSort(list, 0, listsize - 1, reversed);
		}

		endTime = System.currentTimeMillis();
		duration = ((double) (endTime - startTime)) / numiter;

		startTime = System.currentTimeMillis();
		for(int i = 0; i < numiter; i++) {
			for (int j = 0; j < listsize; j++)
				list[j] = randomGenerator.nextInt();
		}
		endTime = System.currentTimeMillis();
		subdur = ((double) (endTime - startTime)) / numiter;

		DecimalFormat df = new DecimalFormat("#.####");
		System.out.println("shellSort---- listsize: " + listsize + " duration: " + df.format((duration - subdur)) + " milliseconds");
	}


	static public void time_quickSort(int listsize, int numiter, boolean reversed) {
		long startTime, endTime;
		Random randomGenerator = new Random();
		Sort sorter = new Sort();
		double duration;
		double subdur;
		int[] list = new int[listsize];

		startTime = System.currentTimeMillis();
		for(int i = 0; i < numiter; i++) {
			for (int j = 0; j < listsize; j++)
				list[j] = randomGenerator.nextInt();
			sorter.quickSort(list, 0, listsize - 1, reversed);
		}

		endTime = System.currentTimeMillis();
		duration = ((double) (endTime - startTime)) / numiter;

		startTime = System.currentTimeMillis();
		for(int i = 0; i < numiter; i++) {
			for (int j = 0; j < listsize; j++)
				list[j] = randomGenerator.nextInt();
		}
		endTime = System.currentTimeMillis();
		subdur = ((double) (endTime - startTime)) / numiter;

		DecimalFormat df = new DecimalFormat("#.####");
		System.out.println("quickSort---- listsize: " + listsize + " duration: " + df.format((duration - subdur)) + " milliseconds");
	}


	static public void time_bucketSort(int listsize, int numiter, boolean reversed) {
		long startTime, endTime;
		Random randomGenerator = new Random();
		Sort sorter = new Sort();
		double duration;
		double subdur;
		int[] list = new int[listsize];

		startTime = System.currentTimeMillis();
		for(int i = 0; i < numiter; i++) {
			for (int j = 0; j < listsize; j++)
				list[j] = randomGenerator.nextInt();
			sorter.bucketSort(list, 0, listsize - 1, reversed);
		}

		endTime = System.currentTimeMillis();
		duration = ((double) (endTime - startTime)) / numiter;

		startTime = System.currentTimeMillis();
		for(int i = 0; i < numiter; i++) {
			for (int j = 0; j < listsize; j++)
				list[j] = randomGenerator.nextInt();
		}
		endTime = System.currentTimeMillis();
		subdur = ((double) (endTime - startTime)) / numiter;

		DecimalFormat df = new DecimalFormat("#.####");
		System.out.println("bucketSort---- listsize: " + listsize + " duration: " + df.format((duration - subdur)) + " milliseconds");
	}


	static public void time_heapSort(int listsize, int numiter, boolean reversed) {
		long startTime, endTime;
		Random randomGenerator = new Random();
		Sort sorter = new Sort();
		double duration;
		double subdur;
		int[] list = new int[listsize];

		startTime = System.currentTimeMillis();
		for(int i = 0; i < numiter; i++) {
			for (int j = 0; j < listsize; j++)
				list[j] = randomGenerator.nextInt();
			sorter.heapSort(list, 0, listsize - 1, reversed);
		}

		endTime = System.currentTimeMillis();
		duration = ((double) (endTime - startTime)) / numiter;

		startTime = System.currentTimeMillis();
		for(int i = 0; i < numiter; i++) {
			for (int j = 0; j < listsize; j++)
				list[j] = randomGenerator.nextInt();
		}
		endTime = System.currentTimeMillis();
		subdur = ((double) (endTime - startTime)) / numiter;

		DecimalFormat df = new DecimalFormat("#.####");
		System.out.println("heapSort---- listsize: " + listsize + " duration: " + df.format((duration - subdur)) + " milliseconds");
	}


	static public void time_stableQuickSort(int listsize, int numiter, boolean reversed) {
		long startTime, endTime;
		Random randomGenerator = new Random();
		Sort sorter = new Sort();
		double duration;
		double subdur;
		int[] list = new int[listsize];

		startTime = System.currentTimeMillis();
		for(int i = 0; i < numiter; i++) {
			for (int j = 0; j < listsize; j++)
				list[j] = randomGenerator.nextInt();
			sorter.stableQuickSort(list, 0, listsize - 1, reversed);
		}

		endTime = System.currentTimeMillis();
		duration = ((double) (endTime - startTime)) / numiter;

		startTime = System.currentTimeMillis();
		for(int i = 0; i < numiter; i++) {
			for (int j = 0; j < listsize; j++)
				list[j] = randomGenerator.nextInt();
		}
		endTime = System.currentTimeMillis();
		subdur = ((double) (endTime - startTime)) / numiter;

		DecimalFormat df = new DecimalFormat("#.####");
		System.out.println("stableQuickSort---- listsize: " + listsize + " duration: " + df.format((duration - subdur)) + " milliseconds");
	}

	static public void time_mergeSortLL(int listsize, int numiter, boolean reversed) {
		long startTime, endTime;
		Random randomGenerator = new Random();
		Sort sorter = new Sort();
		double duration;
		double subdur;
		LLNode list, temp;


		startTime = System.currentTimeMillis();
		for(int i = 0; i < numiter; i++) {
			list = new LLNode(randomGenerator.nextInt(100));
			temp = list;
			for (int j = 0; j < listsize - 1; j++){
				temp.setNext(new LLNode(randomGenerator.nextInt(100)));
				temp  = temp.next();
			}
			sorter.mergeSortLL(list, reversed);
		}

		endTime = System.currentTimeMillis();
		duration = ((double) (endTime - startTime)) / numiter;

		startTime = System.currentTimeMillis();
		for(int i = 0; i < numiter; i++) {
			list = new LLNode(randomGenerator.nextInt(100));
			temp = list;
			for (int j = 0; j < listsize - 1; j++){
				temp.setNext(new LLNode(randomGenerator.nextInt(100)));
				temp  = temp.next();
			}
		}
		endTime = System.currentTimeMillis();
		subdur = ((double) (endTime - startTime)) / numiter;

		DecimalFormat df = new DecimalFormat("#.####");
		System.out.println("mergeSortLL---- listsize: " + listsize + " duration: " + df.format((duration - subdur)) + " milliseconds");
	}


	static public void time_insertionSortLL(int listsize, int numiter, boolean reversed) {
		long startTime, endTime;
		Random randomGenerator = new Random();
		Sort sorter = new Sort();
		double duration;
		double subdur;
		LLNode list, temp;


		startTime = System.currentTimeMillis();
		for(int i = 0; i < numiter; i++) {
			list = new LLNode(randomGenerator.nextInt(100));
			temp = list;
			for (int j = 0; j < listsize - 1; j++){
				temp.setNext(new LLNode(randomGenerator.nextInt(100)));
				temp  = temp.next();
			}
			sorter.insertionSortLL(list, reversed);
		}

		endTime = System.currentTimeMillis();
		duration = ((double) (endTime - startTime)) / numiter;

		startTime = System.currentTimeMillis();
		for(int i = 0; i < numiter; i++) {
			list = new LLNode(randomGenerator.nextInt(100));
			temp = list;
			for (int j = 0; j < listsize - 1; j++){
				temp.setNext(new LLNode(randomGenerator.nextInt(100)));
				temp  = temp.next();
			}
		}
		endTime = System.currentTimeMillis();
		subdur = ((double) (endTime - startTime)) / numiter;

		DecimalFormat df = new DecimalFormat("#.####");
		System.out.println("insertionSortLL---- listsize: " + listsize + " duration: " + df.format((duration - subdur)) + " milliseconds");
	}

	public static void main(String[] args) {
		
		time_mergeSort(50, 100000, false);
		time_mergeSort(100, 10000, false);
		time_mergeSort(200, 10000, false);
		time_mergeSort(300, 10000, false);
		time_mergeSort(400, 10000, false);
		time_mergeSort(500, 10000, false);
		time_mergeSort(1000, 1000, false);
		time_mergeSort(2000, 1000, false);
		time_mergeSort(3000, 1000, false);
		time_mergeSort(4000, 1000, false);
		time_mergeSort(5000, 1000, false);
		time_mergeSort(10000, 100, false);
		time_mergeSort(50000, 100, false);
		time_mergeSort(100000, 100, false);


		System.out.println();
		time_insertionSort(50, 100000, false);
		time_insertionSort(100, 1000, false);
		time_insertionSort(200, 1000, false);
		time_insertionSort(300, 1000, false);
		time_insertionSort(400, 1000, false);
		time_insertionSort(500, 1000, false);
		time_insertionSort(1000, 100, false);
		time_insertionSort(2000, 100, false);
		time_insertionSort(3000, 100, false);
		time_insertionSort(4000, 100, false);
		time_insertionSort(5000, 100, false);
		time_insertionSort(10000, 1, false);
		time_insertionSort(50000, 1, false);
		time_insertionSort(100000, 1, false);

		System.out.println();
		time_bucketSort(50, 100000, false);
		time_bucketSort(100, 10000, false);
		time_bucketSort(200, 1000, false);
		time_bucketSort(300, 1000, false);
		time_bucketSort(400, 1000, false);
		time_bucketSort(500, 1000, false);
		time_bucketSort(1000, 10, false);
		time_bucketSort(2000, 10, false);
		time_bucketSort(3000, 10, false);
		time_bucketSort(4000, 10, false);
		time_bucketSort(5000, 10, false);
		time_bucketSort(10000, 1, false);
		time_bucketSort(50000, 1, false);
		time_bucketSort(100000, 1, false);


		System.out.println();
		time_shellSort(50, 100000, false);
		time_shellSort(100, 10000, false);
		time_shellSort(200, 10000, false);
		time_shellSort(300, 10000, false);
		time_shellSort(400, 10000, false);
		time_shellSort(500, 10000, false);
		time_shellSort(1000, 100, false);
		time_shellSort(2000, 100, false);
		time_shellSort(3000, 100, false);
		time_shellSort(4000, 100, false);
		time_shellSort(5000, 100, false);
		time_shellSort(10000, 1, false);
		time_shellSort(50000, 1, false);
		time_shellSort(100000, 1, false);



		System.out.println();
		time_quickSort(50, 1000000, false);
		time_quickSort(100, 100000, false);
		time_quickSort(200, 100000, false);
		time_quickSort(300, 100000, false);
		time_quickSort(400, 100000, false);
		time_quickSort(500, 100000, false);
		time_quickSort(1000, 1000, false);
		time_quickSort(2000, 1000, false);
		time_quickSort(3000, 1000, false);
		time_quickSort(4000, 1000, false);
		time_quickSort(5000, 1000, false);
		time_quickSort(10000, 10, false);
		time_quickSort(50000, 10, false);
		time_quickSort(100000, 10, false);


		System.out.println();
		time_heapSort(50, 100000, false);
		time_heapSort(100, 10000, false);
		time_heapSort(200, 10000, false);
		time_heapSort(300, 10000, false);
		time_heapSort(400, 1000, false);
		time_heapSort(500, 1000, false);
		time_heapSort(1000, 10, false);
		time_heapSort(2000, 10, false);
		time_heapSort(3000, 10, false);
		time_heapSort(4000, 10, false);
		time_heapSort(5000, 10, false);
		time_heapSort(10000, 1, false);
		time_heapSort(50000, 1, false);
		time_heapSort(100000, 1, false);



		System.out.println();
		time_stableQuickSort(50, 100000, false);
		time_stableQuickSort(100, 10000, false);
		time_stableQuickSort(200, 10000, false);
		time_stableQuickSort(300, 10000, false);
		time_stableQuickSort(400, 10000, false);
		time_stableQuickSort(500, 10000, false);
		time_stableQuickSort(1000, 100, false);
		time_stableQuickSort(2000, 100, false);
		time_stableQuickSort(3000, 100, false);
		time_stableQuickSort(4000, 100, false);
		time_stableQuickSort(5000, 100, false);
		time_stableQuickSort(10000, 1, false);
		time_stableQuickSort(50000, 1, false);
		time_stableQuickSort(100000, 1, false);


		System.out.println();
		time_insertionSortLL(50, 100000, false);
		time_insertionSortLL(100, 10000, false);
		time_insertionSortLL(200, 10000, false);
		time_insertionSortLL(300, 10000, false);
		time_insertionSortLL(400, 10000, false);
		time_insertionSortLL(500, 10000, false);
		time_insertionSortLL(1000, 100, false);
		time_insertionSortLL(2000, 100, false);
		time_insertionSortLL(3000, 100, false);
		time_insertionSortLL(4000, 100, false);
		time_insertionSortLL(5000, 100, false);
		time_insertionSortLL(10000, 10, false);
		time_insertionSortLL(50000, 10, false);
		time_insertionSortLL(100000, 10, false);

		System.out.println();
		time_mergeSortLL(50, 100000, false);
		time_mergeSortLL(100, 10000, false);
		time_mergeSortLL(200, 10000, false);
		time_mergeSortLL(300, 10000, false);
		time_mergeSortLL(400, 10000, false);
		time_mergeSortLL(500, 10000, false);
		time_mergeSortLL(1000, 100, false);
		time_mergeSortLL(2000, 100, false);
		time_mergeSortLL(3000, 100, false);
		time_mergeSortLL(4000, 100, false);
		time_mergeSortLL(5000, 100, false);
		time_mergeSortLL(10000, 1, false);
		time_mergeSortLL(50000, 1, false);
		time_mergeSortLL(100000, 1, false);

	}


}

