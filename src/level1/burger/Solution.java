package level1.burger;

import java.util.Stack;

class Solution {
//    public static void main(String[] args) {
//        level1.burger.Solution solution = new level1.burger.Solution();
//        System.out.println(solution.solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1}));
//    }
    public int size;
    public int result;
    public int solution(int[] ingredient) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ingredient.length; i++) {
            stack.push(ingredient[i]);
            size++;
            if (size < 4) continue;
            if (getStackByIndex(stack,size)){
                size -= 4;
                stack.pop();
                stack.pop();
                stack.pop();
                stack.pop();
                result++;
            }
        }
        return result;
    }

    private boolean getStackByIndex(Stack<Integer> stack, int size) {
        return stack.get(size - 4) == 1 && stack.get(size - 3) == 2 && stack.get(size - 2) == 3 && stack.get(size - 1) == 1;
    }
}

