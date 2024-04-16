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

★ 크롬에 spring io 검색<br>

spring framwork가 spring<br>

spring initializr클릭<br>
2버전 사라지고 3버전<br>
(SNAPSHOT)은 사용하지 않는 것이 좋음<br>

Group은 com.kkwcloud<br>
Artiface는 www<br>
name www<br>
Package는 jar<br>
버전은 17<br>
○ 오른쪽 add dependencies<br>
Spring Boot Dev Tools,<br>
Lombok,<br>
,Spring web<br>
,Spring Security// Security는 아님<br>
,Thymeleaf<br>
,MariaDB Driver(오라클,마리아DB가 반절씩)<br>
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


#0409<br>

★aws에서 css깨질경우 resources/ 경로 확인해 볼것<br>
★ test실행 안되면 build.gradle에서 security주석처리할것 그래도 안되면 db도 주석처리해볼것<br>
db도 연결되어 있어야 test가능<br>
//implementation 'org.springframework.boot:spring-boot-starter-data-jpa'<br>
//implementation 'org.springframework.boot:spring-boot-starter-security'<br>
//implementation 'org.thymeleaf.extras:thymeleaf-extras-springsecurity6'<br>
//runtimeOnly 'org.mariadb.jdbc:mariadb-java-client'<br>
//testImplementation 'org.springframework.security:spring-security-test'<br>

워크북, 쇼핑몰프로젝트 2권남기기<br>
목요일 노트북 가져오기<br>
집에서 할일 movie db create하고 aws에서 실행해보기<br>
★ 톰켓은 application.properties에 있다. 별도 설치 안함<br>


★ https://github.com/lonen8188/Springboot/blob/1.memo/src/main/java/org/zerock/boardboot/repository/MemoRepository.java<br>
JPA-참조 문서 > 3.참고문서 > 3.1JPA저장소 > 3.1.3 쿼리방법 > 쿼리 생성<br>

Mno : 메모의 번호<br>

★ 쿼리문은 대문자로, input박스는 대소문자 일치시킬것<br>
countQuery 몇개의 페이지를 담을 것인가<br>
Thymeleaf는 jsp에서 html로 돌아온것 <br>
Mustache 배우는데 1주일 걸린다.취업하고서를 회사에서 필요하면 그때 공부할것<br>
★ build.gradle 수정하면 코끼리 누르기<br>

★ 실행오류뜨면 int updateMemoBean 주석처리하기<br>
★http://www.thymeleaf.org에서 공부하기<br>
★" "안에는 무조건 ' '<br>
★ 자바 beans 규약<br>
웹에서 실행하고 싶으면 실행 >왼쪽에있는 drop bar를 BoardApplication으로 설정해야한다.<br>

☆ 부트스트랩은 선생님자료 참고할것<br>
☆ 104p책보고하다가 코드가 이상하면 선생님 깃허브 참조하기(build gradle쪽 예: 날짜 처리관련 코드)<br>

122p까지완료<br>
내일 was어떻게 실행해야할지 선생님에게 물어보기 시간낭비가 너무심하다


#0409<br>
122p 실행 안되면 선생님거 참조하기<br>
★★★브런치 만드는 방법  브런치누르고 새브런치: ThymeleafAdd <br>
프로젝트 덮어씌운 후 소스트리에서 올리고 커밋에 "타임리프테스트" > 커밋,푸쉬<br>

xml대신 Repository계층에서 작업<br>
시큐리티 전까지 하는게 미션<br>

★ query dsl 구글검색<br>
책에있는 query dsl는 작동안한다 깃허브 참조 할것<br>
https://github.com/lonen8188/Springboot/blob/2.ThymeleafAdd/build.gradle<br>
수정하고 코끼리 누르기<br>

엔티티 클래스는 가능하면 setter만들기 않기 setter대신 changeContet로 선언<br>

152p<br>
https://green-bin.tistory.com/106<br>
sout + tab<br>

★ 즉시(Eager)fheldrhk 지연(Lazy)로딩 이해하기 221p<br>
447p까지 미션<br>
강사님 Springboot 진도별로 branch해놓으셨음 참고할것<br>
인텔리j설치할때 jdk17설치해야한다.<br>
179p까지완료<br>


★ 원격연결 순서<br>
1. pro업그레이드  https://itcider.com/1572/ 안되면 와이파이 끄기<br>
2. 사용자 / pw 필수 (시작 우클릭 -> 컴퓨터 관리 -> 사용자 계정 -> id 우클릭 -> 암호설정)<br>
3. 시작 우클릭 -> 시스템 ->원격데스크톱 활성화<br>
4. ip주소 알아내기 -> ipconfig<br>
5. 노트북 덥개 닫으면 아무것도 하지 않음 셋팅<br>
제어판 -> 전원옵션<br>
6. 인텔리 제이 설치 및 셋팅<br>
----------------------------------------------------- 노트북<br>

학교 px -> 원격 데스크탑 연결(시스템이아닌 찾기로검색) -> ip 입력 -> id/pw 접속 성공!!!!<br>


#0412
https://github.com/lonen8188/WorkBook/blob/master/src/main/resources/templates/board/list.html
237p

#0416
★316p 버튼 실행 안되면 javascript확인할것
326부터시작하기


★책에서 webuser계정과 db는 heidiSQL에서 알아서 만들기 
CREATE DATABASE webdb;
GRANT SELECT, INSERT, UPDATE, DELETE, DROP, ALTER ON webdb.* TO 'webuser' IDENTIFIED BY 'webuser'

application.properties에서 db넣기
dependencies에서 lombok넣기


]http://192.168.0.150/board/list

★ 만약 프로젝트 옮기면 해야할일
heidiSQL에서 db의 데이터베이스 생성하고 root를 이용하여 계정도 다시 만들어야한다.
