package user.controller;
import user.dto.UserDTO;
import user.vo.UserType;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 * 회원 가입시 사용자 입력 필드를 받는 헬퍼 클래스
 */
public class UserInputHelper {
    private static final Scanner scanner = new Scanner(System.in);


    public static UserDTO getDtoFromUserInfo() {

        System.out.println("사용자 정보를 입력하세요.");
        UserDTO user = new UserDTO();
        user.setUserLoginId(inputUserLoginId());
        user.setUserPassword(inputUserPassword());
        user.setUserAddress(inputUserAddress());
        user.setUserName(inputUserName());
        user.setUserEmail(inputUserEmail());
        user.setUserPhone(inputUserPhone());
        user.setUserBirthDate(inputUserBirthDate());
        user.setUserType(inputUserType());

        return user;
    }


    public static String inputUserLoginId() {
        System.out.print("로그인 ID를 입력하세요: ");
        return scanner.next();
    }

    public static String inputUserPassword() {
        System.out.print("비밀번호를 입력하세요: ");
        return scanner.next();
    }

    public static String inputUserAddress() {
        System.out.print("주소를 입력하세요: ");
        scanner.nextLine(); // 버퍼 비우기
        return scanner.nextLine();
    }

    public static String inputUserName() {
        System.out.print("이름을 입력하세요: ");
        return scanner.next();
    }

    public static String inputUserEmail() {
        System.out.print("이메일을 입력하세요: ");
        return scanner.next();
    }

    public static String inputUserPhone() {
        System.out.print("휴대폰 번호를 입력하세요 (예: 010-1234-5678): ");
        return scanner.next();
    }

    public static LocalDate inputUserBirthDate() {
        System.out.print("생년월일을 입력하세요 (YYYY-MM-DD): ");
        while (true) {
            try {
                return LocalDate.parse(scanner.next());
            } catch (DateTimeParseException e) {
                System.out.print("올바른 날짜 형식(YYYY-MM-DD)으로 입력하세요: ");
            }
        }
    }

    public static UserType inputUserType() {
        System.out.print("사용자 유형을 입력하세요 (admin/client): ");
        while (true) {
            String input = scanner.next().toLowerCase();
            if (input.equals("admin")) return UserType.ADMIN;
            if (input.equals("client")) return UserType.CLIENT;
            System.out.print("올바른 값을 입력하세요 (admin/client): ");
        }
    }
}