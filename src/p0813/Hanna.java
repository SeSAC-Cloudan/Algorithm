package p0813;

import java.util.Arrays;
import java.util.Comparator;

public class Hanna {
 public static void main(String[] args) {
  int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}}; // {수학, 영어} 배열
  int[] ranks = solution(score);
  System.out.println("Ranks: " + Arrays.toString(ranks));
  //ranks 배열을 문자열로 변환하여 출력
 }

 public static int[] solution(int[][] score) {
  int length = score.length;
  int[] avg = new int[length]; // 평균 배열
  Integer[] indices = new Integer[length];  // 인덱스 배열(등수를 매길 때 사용)
  // com

  // 평균 계산 및 인덱스 저장
  for (int i = 0; i < length; i++) {
   avg[i] = (score[i][0] + score[i][1]) / 2;
   indices[i] = i;  // 인덱스를 저장
  }

  // 평균 점수를 기준으로 인덱스 배열 정렬    (내림차순)
  Arrays.sort(indices, new Comparator<Integer>() {
   public int compare(Integer a, Integer b) {
    return Integer.compare(avg[b], avg[a]);  // 내림차순 정렬
   }
  });

  // 등수 매기기
  int[] ranks = new int[length];
  for (int i = 0; i < length; i++) {
   ranks[indices[i]] = i + 1;
  }

  return ranks;
 }

 }

