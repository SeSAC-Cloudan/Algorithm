package p0910;

import java.util.*;

public class Hanna {

    /*
    정수 배열 numbers가 주어집니다.
    numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를
    배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.

    [2,1,3,4,1]	[2,3,4,5,6,7]
    */

    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};
        int[] answer = solution(numbers);
        for (int a : answer) {
            System.out.println(a);
        }
    }

    public static int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int number = numbers[i] + numbers[j];
                set.add(number);
            }
        }

        //Iterator : 자바의 컬렉션(Collection)에 저장되어 있는 요소들을 순회하는 인터페이스
        /*
        정의방법 Iterator<T> iterator = Collection.iterator();
        다음 요소가 있는지 판단하는 hasNext(),  - 반환값 boolean
        다음 요소를 가져오는 next(),
        가져온 요소를 삭제하는 remove()
        */
        Iterator<Integer> iter = set.iterator(); // 반복자 생성
        while (iter.hasNext()) {
            list.add(iter.next());
        }

        //list.addAll(set); (중복)
        Collections.sort(list);

        int[] result = list.stream().mapToInt(i -> i).toArray();
        /*
        list.stream()을 통해 List<Integer>를 스트림으로 변환합니다.
        mapToInt(i -> i)를 통해 Integer 타입의 리스트 요소를 int 타입으로 변환합니다.
        toArray()를 사용해 스트림을 int[] 배열로 변환합니다.
        */

        return result;
    }
}

/*
테스트 1 〉	통과 (3.17ms, 80.5MB)
테스트 2 〉	통과 (4.05ms, 77.1MB)
테스트 3 〉	통과 (3.23ms, 68.7MB)
테스트 4 〉	통과 (2.38ms, 74.7MB)
테스트 5 〉	통과 (2.11ms, 76.5MB)
테스트 6 〉	통과 (2.41ms, 68.6MB)
테스트 7 〉	통과 (6.23ms, 81.1MB)
테스트 8 〉	통과 (2.48ms, 73.9MB)
테스트 9 〉	통과 (2.86ms, 71.6MB)
*/
