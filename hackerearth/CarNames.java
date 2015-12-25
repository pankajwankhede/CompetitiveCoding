/*
Problem: https://www.hackerearth.com/problem/algorithm/car-names-4/description/

*/
class CarNames {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        */

        Scanner in =new Scanner(System.in);
        int N=in.nextInt();
        
        for(int i=0;i<N;i++){
            HashMap<Integer,boolean> nameChars=new HashMap<Integer,boolean>();
            String name=in.next();
            for(int j=0;j<name.length;j++){
                nameChars.put((int)name.charAt(j),true);
            }
            if(nameChars.size()==3)
                System.out.println("OK");
            else
                System.out.println("Not OK");        
        }

    }
}