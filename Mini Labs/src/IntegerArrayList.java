public class IntegerArrayList {
    
    private int[] array;
    private int lastUnusedIndex;
    public final static int DEFAULT_SIZE = 1000;
    
    public IntegerArrayList() {
        this(DEFAULT_SIZE);
    }

    public IntegerArrayList(int size) {
        if (size < 1)
            size = DEFAULT_SIZE;
        
        this.array = new int[size];
        this.lastUnusedIndex = 0;
    }
    
    public int get(int index) {
        if (index < 0 || index >= this.lastUnusedIndex)
            return 0;
        
        return this.array[index];
    }
    
    public void add(int item) {
        
        this.array[this.lastUnusedIndex] = item;
        this.lastUnusedIndex ++;
        
        if (this.lastUnusedIndex >= this.array.length) 
            makeArrayTwiceAsBig();
        
    }
    
    private void makeArrayTwiceAsBig() {
        int[] temp = new int[this.array.length * 2];
        
        for (int i = 0; i < this.array.length; i++)
            temp[i] = this.array[i];
        
        this.array = temp;
    }
    
    public int size() {
        return this.lastUnusedIndex;
    }
    
    public int getInternalArraySize() {
        return this.array.length;
    }
	
	public int getMaxValue(){
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < this.lastUnusedIndex; i++){
			if(this.array[i] > max){
				max = this.array[i];
			}
		}
		
		return max;
	}
	
	public static void main(String[] args){
		
		IntegerArrayList ial = new IntegerArrayList(-1);

		ial.add(5);
		ial.add(3);
		ial.add(5);
		ial.add(7);
		ial.add(-5);
		
		System.out.println(ial.getMaxValue());
		//int sum = 0;
		
		//for (int i = 0; i < ial.size(); i++) {
		//	sum += ial.get(i);
		//}
		
		//System.out.print(sum);
		//System.out.print(ial.size());
		//System.out.print(ial.getInternalArraySize());
	}
}