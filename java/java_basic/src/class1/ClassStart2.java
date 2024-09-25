package class1;
/*
    배열을 사용하면 학생마다 변수를 추가할 필요는 없다

    단점> 배열을 통해 변수의 수를 줄일수는 있으나 한 학생에 대한 데이터가 3개의 배열에 나눠져 있다.
         --> 이 부분이 단점인 이유는 특정 학생에 대한 데이터를 삭제할 때 해당 데이터들이 저장되어 있는 각 배열에 해당 원소를 삭제 해야하기에
         조심성이 요구되기 때문이다


    즉, 속성(이름, 나이, 성적)을 따로 나누어서 관리하는 것은 좋은 방식이 x
    좋은방식 --> '학생'이라는 개념을 하나로 묶어 각각의 학생 별로 본인의 이름, 나이, 성적을 관리하는 것
 */
public class ClassStart2 {

    public static void main(String[] args) {
        String[] students = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90,80};

        for (int i = 0 ; i < students.length ; i++){
            System.out.println("이름:" + students[i] + " 나이:" + studentAges[i] + " 성적:" + studentGrades[i]);
        }
    }
}
