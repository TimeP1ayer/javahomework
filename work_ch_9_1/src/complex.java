public class complex {
    int x;
    int y;

    public complex(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public complex plus(complex[] a){
        if (a.length!=2||a==null){return null;}
        complex plus = new complex(0,0);
        plus.x=a[0].x+a[1].x;
        plus.y=a[0].y+a[1].y;
        return plus;
    }

    public int getXfromString(String s) {
        int x;
        int left=s.indexOf("(");
        int p=s.indexOf(",");
        String sx = s.substring(left+1,p);
        x=Integer.parseInt(sx);
        return x;
    }

    public int getYfromString(String s) {
        int y;
        int i=s.indexOf("i");
        int p=s.indexOf(",");
        String sy = s.substring(p+1,i);
        y=Integer.parseInt(sy);
        return y;
    }

    public complex[] returnComplexCollection(String s){
            try {
                complex[] collection = new complex[2];
                int p=s.indexOf("+");
                String s1=s.substring(1,p-1);
                String s2=s.substring(p+2,s.length()-1);

                int x1 = getXfromString(s1);
                int y1 = getYfromString(s1);

                int x2 = getXfromString(s2);
                int y2 = getYfromString(s2);


                complex f1=new complex(x1,y1);
                complex f2=new complex(x2,y2);

                collection[0]=f1;
                collection[1]=f2;

                return collection;
            }catch (Exception e){
                System.out.println("wrong form");
                return null;
            }

    }

}
