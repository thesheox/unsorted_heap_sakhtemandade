public class main_table {
    public static void main(String[] args){
        UnsortedTableMap<Character,Integer> map1=new UnsortedTableMap<Character,Integer>();
        String s="shayan saeidian";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map1.get(c)==null){
                map1.put(c, 1);
            }
            else{
                int key=map1.get(c)+1;
                map1.put(c, key);
            }
        }
        map1.put('s',2);
        for(Entry<Character,Integer> e:map1.entrySet()){
            System.out.print(e.getKey());
            System.out.print(" : ");
            System.out.println(e.getValue());
        }
    }
    
}
