package problemset06;

public class problemset06 extends Stopwatch {
	public static void main(String args[]) {
		Comparable[] array = new Comparable[1000000];
		for (int i = 0; i < 1000000; i++) {
			array[i] = (int) (Math.random() * 1000000);
		}
		Stopwatch watch = new Stopwatch();

		MergeX.sort(array);
		System.out.println("Time elapsed for regular mergeSort of 100000 : " + watch.elapsedTime());

	}
}
