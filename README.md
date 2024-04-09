# bootStudy
0408
JPA, PAGE, SORT 학습완료




#0408<br>
IntelliJ IDEA Ultimate 유료,
IntelliJ IDEA Community Edition가 무료
가상머신써도 충분<br>

★ 설치절차<br>
Path에 "bin"폴더 추가 on하기<br>
.java, .pom 체크<br>

데이터 공유는 '보내지 않음'<br>

앞으로는 스프링을 부트라고 생각해야한다.<br>

크롬에 spring io 검색<br>

spring framwork가 spring<br>

spring initializr클릭<br>
2버전 사라지고 3버전<br>
(SNAPSHOT)은 사용하지 않는 것이 좋음<br>

Group은 com.kkwcloud<br>
Artiface는 www<br>
name www<br>
Package는 jar<br>
버전은 17<br>
오른쪽 add dependencies<br>
Spring Boot Dev Tools<br>
Lombok,
,Spring web
,Spring Security// Security는 아님
,Thymeleaf
,MariaDB Driver(오라클,마리아DB가 반절씩)
,Spring Data JPA<br>

boot-workspace폴더 생성하고 www폴더 옮긴다.<br>

settings > Plugins에서 Lombok 설치<br>
korea검색하여 설치하면  한글화 가능<br>
Security 5버전 안먹히고 6버전부터 사용된다.<br>

소스트리에다가 붙이고 올리고 연습한다.<br>
코배스부교재 유튜브도 있음(구멍가게 코딩단) p붙은게 스프링 b가 부트<br>
카페가서 오류찾아보기<br>

vm 탭 오른쪽 클릭 > setting > Bridged로 변경하기<br>
오른쪽 네트워크 열기 <br>
어댑터 옵션 변경> 인터넷 프로토콜 버전 4(TCP/IPv4)<br>
0 ,223<br>0,1로 ip변경
cmd>ipconfig > ping www.naver.com<br>
깃 연결 <br>


linux부터할수있다 pass개발자<br>
aws게시부터 할수 있다.saas개발자<br>
톰켓 9버전이 스프링에서는 java<br>
톰켓 10버전은 jakar 사용한다.(부트부터는 10부터)<br>
부트는 xml안쓴다 보안에 취약함 자바 bin이라는 객체이서 관리한다.<br>
3년 이상 버티기<br>
★ 깃<br>
깃 토큰 잃어버렸으면 info 가서 Tokens(classic)<br>

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 :깃토큰<br>
> Sourcetree >ssh는 아니요 > <br>
상단 탭 도구 > 옵션 > 인증<br>
호스팅 서비스 gitHub, 선호 프로토콜 : https > <br>
인증 Personal acount<br>

★깃허브에서  프로젝트생성 : bootStudy<br>
add.gitgnore : java , Choose a license :apache license2.0<br>
Remote> 새로고침 > clone > bootstudy폴더 만들고 경로로 하기<br>
gitgnore.txt에 sql파일도 입력할것<br>
pull<br>
원격 누르면 깃주소로간다. Blame누르면 history보인다.<br>

Maven사용안함 Gradle-Groovy사용<br>
진짜 게시할때 jar를사용<br>
jar와 war차이점<br>
3.1.10버전<br>
Thymeleaf가 React로 대체된다.<br>
build.gradle 가 pom.xml<br>
static에다 cs,js 확장자가 html<br>
application.properties가 톰켓 관리<br>

★시그니쳐v
BoardApplication의 main으로 부트는 실행한다.<br>

구글 spring boot banner Generator<br>
https://devops.datenkollektiv.de/banner.txt/index.html<br>
resources 안에다 banner.txt넣기<br>
팀프로젝트에서 구별할때 필요<br>

포트번호 8080인거 80나 핸드폰번호 뒷자리로 변경<br>
setting에서 utf-8로 변경<br>

주석 ##<br>
★마리아 DB 10버전 설치 <br>
중요한거 Thired party tools 무조건 체크하기 토드같은거<br>
★ use Utf-8 as default server's character set 무조건 체크하기<br>
마리아 포트번호는 3306<br>
HeidiSQL 은 토드라고 생각하면된다.<br>

마리아DB는 컴퓨터이름으로도 DB에 접속할 수 있다.<br>
사용자 관리자에 localhost랑 %만 남기고 삭제후 새계정 작성 bootuser(책참조)<br>
HeidiSQL 닫았다가 bootuser로 로그인 > 사용자 인증및 권한 관리눌러보자<br>
눌러도 root계정에서만 사용가능하다.<br>

톰켓폴더 안에더 war넣으면 끝남<br>
sout엔터치면 콘솔로그작성된다.<br>
   testCompileOnly 'org.projectlombok:lombok'      // 테스트 코드에서 롬북 사용 가능하게 설정<br>
testAnnotationProcessor 'org.projectlombok:lombok'<br> ★build.gradle 입력하고 코끼리 누를것<br>

D:\workspace\board\build\libs 에있는 패키지<br>
d드라이브로 복붙하기<br>
cmd 열고 , D:<br>
java -jar board-0.0.1-SNAPSHOT.jar<br>
시스템에서 고급 환경설정 > java 17 설치 및 환경변수 생성해야한다.<br>
45p orm이 먼지 jpa가 먼지 무조건 면접에서 물어본다.<br>
엔티티와 jpaRepository 제일 중요<br>
https://github.com/lonen8188/Springboot/blob/memo/src/main/java/org/zerock/boardboot/entity/Memo.java<br>

리포지토리는 무조건 인터페이스<br>
delete 는 db 리스트 전부삭제됨 deleteById 사용하기<br>
★ getOne 차단되었다.findById(mno) 사용할것<br>

updateTest 찾아보아서 없으면 insert를 실행한다.<br>

Pageable는 domain으로 import해야한다.<br>

깃허브에서 push 한다음 src/main/resources/application.properties 소스코드 깨져있으니
인텔리제이에서 코드 별도로 복붙할것 <br>

82p<br>
★ tests 실행할때 오류 생기면 mariaDB설치하기<br>
