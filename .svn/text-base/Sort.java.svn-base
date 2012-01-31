import java.util.Random;

public class Sort implements SortInterface{

	/*stableQuickSort
	 * (non-Javadoc)
	 * @see SortInterface#stableQuickSort(int[], int, int, boolean)
	 */
	public void stableQuickSort(int[] array, int lowindex, int highindex, boolean reversed) {
		stableQuickSort(array, new int[array.length], lowindex, highindex, reversed);
	}

	private void stableQuickSort(int[] array, int[] temp, int lowindex,int highindex, boolean reversed) {
		int pivot;
		if (lowindex < highindex) {
			pivot = stablePartition(array, temp, lowindex, highindex, reversed);
			stableQuickSort(array, temp, lowindex, pivot - 1, reversed);
			stableQuickSort(array, temp, pivot + 1, highindex, reversed);
		}
	}

	private int stablePartition(int[] array, int[] temp, int lowindex, int highindex, boolean reversed) {
		Compare firstcond, secondcond;
		if (reversed){
			firstcond = new Compare(Compare.type.GREATERTHAN);
			secondcond = new Compare(Compare.type.LESSTHAN);
		}
		else{
			firstcond = new Compare(Compare.type.LESSTHAN);
			secondcond =  new Compare(Compare.type.GREATERTHAN);
		}
		int pivot = 0;
		int midindex = (lowindex + highindex) /2;
		int median = getmedian(lowindex, highindex, midindex, 
				array[lowindex], array[highindex], array[midindex]);

		int index = lowindex;
		for(int i = lowindex; i <= highindex; i++){
			if (firstcond.compareto(array[i], array[median])){
				temp[index] = array[i];
				index++;
			}
		}

		for(int i = lowindex; i <= highindex; i++){
			if (array[i] == array[median]){
				if (median == i)
					pivot = index;
				temp[index] = array[i];
				index++;
			}
		}

		for(int i = lowindex; i <= highindex; i++){			
			if (secondcond.compareto(array[i], array[median])){
				temp[index] = array[i];
				index++;
			}
		}

		for(int i = lowindex; i <= highindex; i++)
			array[i] = temp[i];
		temp = null;
		return pivot;
	}







	/*quickSort
	 * (non-Javadoc)
	 * @see SortInterface#quickSort(int[], int, int, boolean)
	 */
	public void quickSort(int[] array, int lowindex, int highindex, boolean reversed) {
		int pivot;
		if (lowindex < highindex) {
			pivot = partition(array, lowindex, highindex, reversed);
			quickSort(array, lowindex, pivot - 1, reversed);
			quickSort(array, pivot + 1, highindex, reversed);
		}
	}

	private int partition(int[] array, int lowindex, int highindex, boolean reversed) {
		int pivot;
		int temp;
		int max = highindex;
		int midindex = (lowindex + highindex) /2;
		int median = getmedian(lowindex, highindex, midindex, 
				array[lowindex], array[highindex], array[midindex]);
		Compare firstcond, secondcond;
		if (reversed){
			firstcond = new Compare(Compare.type.GREATERTHAN);
			secondcond = new Compare(Compare.type.LESSTHAN);
		}
		else{
			firstcond = new Compare(Compare.type.LESSTHAN);
			secondcond =  new Compare(Compare.type.GREATERTHAN);
		}

		temp = array[median];
		array[median] = array[highindex];
		array[highindex] = temp;
		pivot = array[highindex];
		lowindex--;

		do{
			while(firstcond.compareto(array[++lowindex], pivot));
			while(lowindex < highindex && secondcond.compareto(array[--highindex],pivot));
			temp = array[lowindex];
			array[lowindex] = array[highindex];
			array[highindex] = temp;
		}while(lowindex < highindex);
		temp = array[lowindex];
		array[lowindex] = array[max];
		array[max] = temp;
		return lowindex;
	}


	private int getmedian(int lowindex, int highindex, int midindex, int low, int high, int mid) {
		if(low < high){
			if(mid < low)
				return lowindex;
			else if (mid < high)
				return midindex; 
			return highindex;
		}
		if (mid < high)
			return highindex;
		else if(mid < low)
			return midindex;
		return lowindex;
	}





	/*shellSort
	 * (non-Javadoc)
	 * @see SortInterface#shellSort(int[], int, int, boolean)
	 */
	public void shellSort(int[] array, int lowindex, int highindex, boolean reversed) {
		int increment, offset;
		int n = highindex - lowindex + 1;
		int k = (int) (Math.log(n)/Math.log(2));


		for (increment = 2^k - 1; increment >  0; increment = 2^(--k) - 1){
			for (offset = lowindex; offset < increment + lowindex; offset++) 
				shellInsert(array, lowindex, highindex, offset, increment, reversed);
		}
	}

	public static void shellInsert(int[] array, int lowindex, int highindex, int offset, int increment, boolean reversed){
		Compare c = new Compare(reversed ? Compare.type.LESSTHAN 
				: Compare.type.GREATERTHAN);
		int i,j, curr;
		int n = array.length;


		for (i = offset + increment + lowindex - 1; i <= highindex && i < n; i += increment){
			curr = array[i];
			for(j = i - increment; j >= lowindex && j >= 0 && c.compareto(array[j], curr); j -= increment) 
				array[j + increment] = array[j];
			array[j + increment] = curr;
		}
	}




	/*insertionSort
	 * (non-Javadoc)
	 * @see SortInterface#insertionSort(int[], int, int, boolean)
	 */
	public void insertionSort(int[] array, int lowindex, int highindex, boolean reversed) {
		Compare c = new Compare(reversed ? Compare.type.LESSTHAN 
				: Compare.type.GREATERTHAN);
		int i, j, curr;
		int n = array.length;

		for (i = lowindex + 1; i <= highindex && i < n; i++) {
			curr = array[i];
			for (j= i - 1; j >= lowindex && j >= 0 && c.compareto(array[j], curr); j--)
				array[j+1] = array[j];
			array[j+1] = curr;
		}
	}


	/*insertionSortLL
	 * (non-Javadoc)
	 * @see SortInterface#insertionSortLL(LLNode, boolean)
	 */
	public LLNode insertionSortLL(LLNode list, boolean reversed) {
		LLNode sorted = null;
		LLNode temp, temp2;

		temp = list;
		while (temp != null){
			temp2 = temp.next();
			sorted = InsertLLHelper(sorted, temp, reversed);
			temp = temp2;
		}

		return sorted;
	}

	private LLNode InsertLLHelper(LLNode sorted, LLNode node, boolean reversed) {
		LLNode temp;
		Compare c = reversed ? new Compare(Compare.type.GREATERTHAN) : new Compare(Compare.type.LESSTHAN);

		if (sorted == null){
			node.setNext(null);
			return node;
		}

		if (c.compareto(node.elem(), sorted.elem())){
			node.setNext(sorted);
			return node;
		}

		boolean done = false;
		for (temp = sorted; temp.next() != null; temp = temp.next()){
			if (c.compareto(node.elem(), temp.next().elem())){
				node.setNext(temp.next());
				temp.setNext(node);
				done = true;
				break;
			}
		}
		if (!done){
			temp.setNext(node);	
			node.setNext(null);
		}

		return sorted;
	}





	/*mergeSort
	 * (non-Javadoc)
	 * @see SortInterface#mergeSort(int[], int, int, boolean)
	 */
	public void mergeSort(int[] array, int lowindex, int highindex, boolean reversed) {
		mergeSort(array, new int[array.length], lowindex, highindex, reversed);
	}

	private void mergeSort(int[] array, int[] temp, int lowindex, int highindex, boolean reversed) {
		int mid;
		if (lowindex >= highindex)
			return;

		mid = (lowindex + highindex) / 2;
		mergeSort(array, temp, lowindex, mid, reversed);
		mergeSort(array, temp, mid+1, highindex, reversed);
		merge(array, temp, lowindex, mid, highindex, reversed);
	}

	private void merge(int[] array, int[] temp, int low, int mid, int high, boolean reversed) {
		Compare c = reversed ? new Compare(Compare.type.GREATERTHAN) : new Compare(Compare.type.LESSTHAN);
		int insertindex = low;
		int lowindex = low;
		int highindex = mid + 1;
		while (insertindex <= high) {
			if (lowindex > mid)
				temp[insertindex++] = array[highindex++];
			else if (highindex > high) 
				temp[insertindex++] = array[lowindex++];
			else if (c.compareto(array[lowindex], array[highindex]))
				temp[insertindex++] = array[lowindex++];
			else
				temp[insertindex++] = array[highindex++];
		}
		for (insertindex = low; insertindex <= high; insertindex++)
			array[insertindex] = temp[insertindex];
	}







	/*mergeSortLL
	 * (non-Javadoc)
	 * @see SortInterface#mergeSortLL(LLNode, boolean)
	 */
	public LLNode mergeSortLL(LLNode list, boolean reversed) {
		LLNode temp, temp2;
		LLNode list2;
		temp = list;
		temp2 = list;
		if(temp2.next() == null)
			return list;
		while(temp2.next() != null){
			if (temp2.next().next() != null){
				temp2 = temp2.next().next();
				temp =temp.next();
			}
			else
				temp2 = temp2.next();
		} 
		list2 = temp.next();
		temp.setNext(null);
		list = mergeSortLL(list, reversed);
		list2 = mergeSortLL(list2, reversed);
		return mergeLL(list, list2, reversed);
	}

	private LLNode mergeLL(LLNode list, LLNode list2, boolean reversed) {
		Compare c = new Compare(reversed ? Compare.type.GREATERTHAN
				: Compare.type.LESSTHAN);
		LLNode sortList = null;
		LLNode sortListTemp;
		LLNode temp = list;
		LLNode temp2 = list2;

		if (c.compareto(temp.elem(), temp2.elem())){
			sortList = temp;
			temp = temp.next();
		}
		else{
			sortList = temp2;
			temp2 = temp2.next();
		}
		sortListTemp = sortList;

		while(temp != null && temp2 != null){
			if (c.compareto(temp.elem(), temp2.elem())){
				sortListTemp.setNext(temp);
				temp = temp.next();
			}
			else {
				sortListTemp.setNext(temp2);
				temp2 = temp2.next();
			}
			sortListTemp = sortListTemp.next();
		}

		if (temp != null)
			sortListTemp.setNext(temp);
		else if (temp2 != null) 
			sortListTemp.setNext(temp2);
		return sortList;
	}







	/*bucketSort
	 * (non-Javadoc)
	 * @see SortInterface#bucketSort(int[], int, int, boolean)
	 */
	public void bucketSort(int[] array, int lowindex, int highindex, boolean reversed) {
		int size = highindex - lowindex + 1;
		int bucketarraysize = size/2;
		LLNode[] buckets = new LLNode[bucketarraysize];
		int rangesmall = Integer.MAX_VALUE; 
		int rangelarge = Integer.MIN_VALUE;
		int j;

		for (int i = lowindex; i <= highindex; i++){
			rangesmall = array[i] < rangesmall ? array[i] : rangesmall;
			rangelarge = array[i] > rangelarge ? array[i] : rangelarge;
		}

		int increment = (rangelarge - rangesmall + 1)/bucketarraysize ;
		boolean added;
		int rs;

		for (int i = lowindex; i <= highindex; i++){
			added = false;
			rs = rangesmall;

			j = reversed ? bucketarraysize - 1 : 0;
			while(j < bucketarraysize && j >= 0 && !added){
				if(array[i] >= rs && array[i] < rs + increment){
					buckets[j] = InsertLLHelper(buckets[j], new LLNode(array[i]), reversed);
					added = true;
				}
				rs += increment;
				j = reversed ? j - 1 : j + 1;
			}

			if (!added){
				int index = reversed ? 0 : bucketarraysize - 1;
				buckets[index] = InsertLLHelper(buckets[index], new LLNode(array[i]), reversed);
			}
		}

		j = lowindex;
		for (int i = 0; i < bucketarraysize; i++){
			if (buckets[i] != null){
				for (LLNode temp = buckets[i]; temp != null; temp = temp.next()){
					array[j] = temp.elem();
					j++;
				}
			}
		}
	}



	/*heapSort
	 * (non-Javadoc)
	 * @see SortInterface#heapSort(int[], int, int, boolean)
	 */
	public void heapSort(int[] array, int lowindex, int highindex, boolean reversed) {
		while(highindex >= lowindex) {
			int size = highindex - lowindex + 1;
			for(int i = size/2 + lowindex; i >= lowindex; i--)
				pushdown(array, i, lowindex, highindex, reversed);
			swap(array, lowindex, size - 1);
			pushdown(array, lowindex, lowindex, highindex, reversed);
			highindex--;
		}
	}

	private void pushdown(int[] array, int position, int lowindex, int highindex, boolean reversed) {
		Compare c = reversed ? new Compare(Compare.type.GREATERTHAN) : new Compare(Compare.type.LESSTHAN);
		int size = highindex - lowindex + 1; 
		int smallestchild;
		while(position < size/2 + lowindex){
			smallestchild = leftchild(position, lowindex);
			if ((smallestchild < size) && (array[smallestchild] > array[smallestchild+1]))//
			//if ((smallestchild < size) && (c.compareto(array[smallestchild], array[smallestchild+1])))//
				smallestchild = smallestchild + 1;
			if ( array[smallestchild] + 1 > array[position]) //
			//if ( c.compareto(array[smallestchild] + 1, array[position])) //
				return;	
			swap(array, position, smallestchild);
			position = smallestchild;
		}
	}

	private void swap(int[] array, int pos1, int pos2) {
		int tmp;
		tmp = array[pos1];
		array[pos1] = array[pos2];
		array[pos2] = tmp;
	}

	private int leftchild(int position, int lowindex) {
		return 2*position - lowindex;	
	}

	public static void main(String[] args) {
		Sort s = new Sort();
		int [] random;
		LLNode randomLL;

		System.out.println("\n\nheapSort increasing");
		random = SortTest.random(100);
		for(int i : random)
			System.out.print(i + " ");
		System.out.println();
		s.heapSort(random, 0, 99, true);
		for(int i : random)
			System.out.print(i + " ");

		System.out.println("\n\nheapSort decreasing");

		random = SortTest.random(100);
		for(int i : random)
			System.out.print(i + " ");
		System.out.println();
		s.heapSort(random, 0, 99, false);
		for(int i : random)
			System.out.print(i + " ");



	}

}


