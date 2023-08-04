#### 배열 int[] num_list 를 Stream 으로 변환하는 방법

1. Arrays 클래스의 stream 메서드
   - IntStream intStream = Arrays.stream(num_list);
2. Stream 클래스의 of 메서드
   - IntStream intStream = IntStream.of(num_list);
