import java.util.Scanner;
public class main {

    public static void main(String arg[]){
        Scanner cIn = new Scanner(System.in);
        int size = cIn.nextInt();
        int values[] = new int[size];
        String s = cIn.nextLine();
        s = cIn.nextLine();
        String[] xx = s.split(" ");
//        System.out.println(s);
//        if(true)
//        return;
        for(int i = 0; i < size;i++){

            values[i]=Integer.parseInt(xx[i]);
        }
        node[] nodes = new node[size];
        for(int i = 0; i < size;i++){
            nodes[i]= new node(i);
        }
        node root = null;
        for(int i = 0 ; i<size;i++){
            if(values[i]!= -1)
            nodes[values[i]].addChild(nodes[i]);
            else root = nodes[i];
        }

//        for(int i =0;i<size;i++){
//            for(int j = 0 ;j<size;j++){
//                if(values[j]==i){
//                    nodes[i].addChild(nodes[j]);
//                    continue;
//                }
//                if(values[j]==-1){
//                    root = nodes[j];
//                }
//
//            }
//
//        }

      tree theTree = new tree(root);
        theTree.calcHgt(0,theTree.root);
        System.out.println(++theTree.hgt);

    }

}
 class node {
    public int value;
    public node[] child = null;
    node(int value){
        this.value = value;
    }
    void addChild(node child){
        if(this.child == null){
            this.child = new node[1];
            this.child[0] = child;


        }else{
            int length = this.child.length;
            node[] placehld = new node[length+1];
            for (int i = 0; i < length;i++){
                placehld[i]=this.child[i];



            }
            placehld[length]= child;
            this.child = placehld;
        }


    }


}

 class tree {
    node root;
    int hgt=0;
    tree(node root){
        this.root = root;
    }
    void calcHgt(int val,node nd){
        if(nd.child == null){
            if(val > this.hgt) this.hgt = val;

            return;

        }
        for(int i = 0 ; i <nd.child.length;i++){
            int x =  val+1;
            calcHgt(x,nd.child[i]);

        }

    }


}
