package Level1;

public class K번째수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] a = solution(array, commands);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public static int[] solution(int[] array, int[][] commands) {
        int size = commands.length;
        int[] answer = new int[size];
        
        int k = 0;
        for (int i = 0; i < size; i++) { 
            int[] divisionArray = division(array, commands[i][0], commands[i][1]);
            quickSort(divisionArray, 0, divisionArray.length - 1);
            int index = commands[i][2] - 1;
            int a = divisionArray[index];
            answer[k++] = a;
        }
        return answer;
    }
    
    public static int[] division(int[] array, int start, int end) {
        int[] tmp = new int[end - start + 1];
        int j = 0;
        for (int i = start - 1; i < end; i++) { 
            tmp[j++] = array[i];
        }
        return tmp;
    }
    
    public static void quickSort(int[] a, int p, int r) {
        if (p < r) {
            int q = partition(a, p, r);
            quickSort(a, p, q - 1);
            quickSort(a, q + 1, r);
        }
    }
    
    public static int partition(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p - 1;
        
        for (int j = p; j < r; j++) {
           if (a[j] <= pivot) {
               i += 1;
               swap(a, i, j);
           } 
        }
        swap(a, i + 1, r);
        
        return i + 1;
    }
    
    public static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

}
