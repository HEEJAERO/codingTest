package doit.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class DoIt_16 {
    // 1377 - 골드3 - 이후 다시 풀어보자
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        mData[] arr = new mData[n];
        for(int i=0;i<n;i++){
            arr[i] = new mData(Integer.parseInt(br.readLine()), i);
        }
        Arrays.sort(arr);
        int max = 0;
        for(int i=0;i<n;i++){
            if(arr[i].index-i >max){
                max = arr[i].index - i;
            }
        }
        System.out.println(max + 1);
    }
}
class mData implements Comparable<mData> {
    int value;
    int index;
    mData(){

    }
    mData(int value, int index) {
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(mData o) { // value 를 기준으로 오름차순정렬
        return this.value - o.value;
    }
}
