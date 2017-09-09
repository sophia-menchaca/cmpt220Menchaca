public class PrintTable {
    public static void main(String args[]) {
        System.out.println(&quot;a&#92;ta^2&#92;ta^3&quot;);
        int array[]={1,4,9,16};
        int array2[]={1,8,27,64};
        
        for (int counter=0;counter&lt;array.length;counter++) {
            System.out.println((counter+1) + &quot;&#92;t&quot; + array[counter] + &quot;&#92;t&quot; + array2[counter]);
        }
    }
}
