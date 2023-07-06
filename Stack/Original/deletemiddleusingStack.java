package Stack.Original;

import java.util.Stack;

public class deletemiddleusingStack {
    public static void main(String[] args) {
        int n = 12345;
        int ans=0;
        Stack<Integer> s = new Stack<>();
        while (n!=0){
            int last = n % 10;
            s.push(last);
            n/=10;
        }
        int size = s.size();
        Stack<Integer> s1 = new Stack<>();
        for (int i = 0; i < size/2; i++) {
            s1.push(s.get(i));
        }
        for (int i = size/2+1; i <size ; i++) {
            s1.push(s.get(i));
        }
        while (!s1.empty()){
            int last = s1.pop();
            ans = ans * 10 + last;
        }
        System.out.println(ans);
    }
}
