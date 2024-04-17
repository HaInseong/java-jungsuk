package ch8;

/**
 * 연결된 예외란?
 * 어떤 예외를 다른 예외로 감싸는 것.
 * 예외 A가 예외 B를 발생시키면, A는 B의 원인 예외
 * Throwable initCause(Throwable cause) 지정한 예외를 원인 예외로 등록
 * Throwable getCause() 원인 예외를 반환
 * - 참고: Throwable은 Exception과 Error의 조상
 * 원인 예외를 저장하기 위한 cause 필드 존재
 */

/**
 * 연결된 예외를 사용하는 이유는?
 * 1. 여러 예외를 하나로 묶어서 다루기 위해서 = 예외 원인을 단계별로 파악 가능해진다.
 * 2. checked예외(Exception 자손, 필수처리)를 unchecked예외(RuntimeException 자손, 선택처리)로 변경하려 할 때
 * = 이미 많은 곳에서 상속계층도가 만들어졌을 때 단순히 RuntimeException으로 상속 클래스를 밖는게 쉽지 않다.
 * 그래서 RuntimeException에 포함시켜서 위장시키는 방법을 사용한다.
 * 필수처리 예외이면 꼭 try-catch를 작성해야하는데, try-catch문이 거추장스럽고 불필요할 때 선택처리로 변경하기 위해서 연결된 예외 사용한다.
 */


class Ex8_9_연결된예외 {
    public static void main(String args[]) {
        try {
            install();
        } catch(InstallException e) {
            e.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        }
    } // main의 끝

    static void install() throws InstallException { // 직접 예외처리 X, 두 예외를 연결하는 작업만
        try {
            startInstall();		// 프로그램 설치에 필요한 준비를 한다.
            copyFiles();		// 파일들을 복사한다.
        } catch (SpaceException e)	{
            InstallException ie = new InstallException("설치중 예외발생");
            ie.initCause(e); // ★ SpaceException을 원인 예외로 등록 = 연결된 예외라 한다.
            throw ie; // 예외를 다시 던진다.
        } catch (MemoryException me) {
            InstallException ie = new InstallException("설치중 예외발생");
            ie.initCause(me);
            throw ie;
        } finally {
            deleteTempFiles();	// 프로그램 설치에 사용된 임시파일들을 삭제한다.
        } // try의 끝
    }

    static void startInstall() throws SpaceException, MemoryException {
        if(!enoughSpace()) { 		// 충분한 설치 공간이 없으면...
            throw new SpaceException("설치할 공간이 부족합니다.");
        }

        if (!enoughMemory()) {		// 충분한 메모리가 없으면...
            throw new MemoryException("메모리가 부족합니다.");
//		throw new RuntimeException(new MemoryException("메모리가 부족합니다."));
        }
    } // startInstall메서드의 끝

    static void copyFiles() { /* 파일들을 복사하는 코드를 적는다. */ }
    static void deleteTempFiles() { /* 임시파일들을 삭제하는 코드를 적는다.*/}

    static boolean enoughSpace()   {
        // 설치하는데 필요한 공간이 있는지 확인하는 코드를 적는다.
        return false;
    }
    static boolean enoughMemory() {
        // 설치하는데 필요한 메모리공간이 있는지 확인하는 코드를 적는다.
        return true;
    }
} // ExceptionTest클래스의 끝

class InstallException extends Exception {
    InstallException(String msg) {
        super(msg);
    }
}

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}