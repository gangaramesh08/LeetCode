package programs.containerwithmostwater;

public class ContainerWithMostWaterSolution {
    public static void main(String[] args) {
        int[] tank = {4,2,3,4};
        System.out.println(maxArea(tank));
    }
    public static int maxArea(int[] height) {
        int fp=0;
        int lp = height.length-1;
        int max = 0;
        int area = 0;
        while(fp<lp){
            if(height[fp]<height[lp]){
                area = height[fp] * (lp-fp);
                fp++;
            } else if(height[fp]>height[lp]){
                area = height[lp] * (lp - fp);
                lp--;
            } else{
                area = height[fp] * (lp - fp);
                fp++;
                lp--;
            }
            if(area>max){
                max = area;
            }
        }
        return max;
    }
}
