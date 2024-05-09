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


#0412<br>
https://github.com/lonen8188/WorkBook/blob/master/src/main/resources/templates/board/list.html<br>

#0416<br>
★316p 버튼 실행 안되면 javascript확인할것<br>
326부터시작하기<br>


★책에서 webuser계정과 db는 heidiSQL에서 알아서 만들기 <br>
CREATE DATABASE webdb;<br>
GRANT SELECT, INSERT, UPDATE, DELETE, DROP, ALTER ON webdb.* TO 'webuser' IDENTIFIED BY 'webuser'<br>

application.properties에서 db넣기<br>
dependencies에서 lombok넣기<br>

인텔리제이 웹 빌드안되고 오류 발생하면 db에서 database와 계정 생성했는지 확인할것


]http://192.168.0.150/board/list

★ 만약 프로젝트 옮기면 해야할일
heidiSQL에서 db의 데이터베이스 생성하고 root를 이용하여 계정도 다시 만들어야한다.<br>

#0417<br>
document.querySelector는  html5문법<br>
read.html<br>

workbook에서 board와 member가 foreign 키 연결안되어있음<br>

★ 오류<br>
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap<br>
https://netcanis.tistory.com/85<br>

#0418<br>
수업자료에서 > 10.프로젝트 > 오늘의 대타 > 문서 참조할것 기본<br>

워크북 이번주 Security까지 마감<br>
4~5번 반복하고 이론 읽어보기<br>

erp
기능,생산,출고,출입,입고<br>
wms

#0424<br>

ui는 보여주는거 back코드 ppt, 파일정의서, url정의서<br>


포폴에다가 조원소개 링크 만들어서 이력서 자소서 넣어보기<br>
개인소개페이지 실제로 할수있는 직무 능력만<br>
자바,오라클 마리아db 이클립스<br>

★ Application run failed org.springframework.beans.factory.BeanCreationException:
오류발생하면 Post, get 잘못입력했는지 확인<br>

★ @Override 자동완성이 보이기만 하고 완성은 안되면 implements 상속가 있는지 확인<br>

★★★ ctrl shift f로 오류 찾을수 있음<br>

★DB에서 DB로 데이터를 옮기고 싶을때  하이디에서 데이터베이스를 다른 db로 내보네기<br>
삭제 버튼 체크하면 삭제된하 새로운 DB는 생성<br>
포트80번쓰지말고 조장 핸드폰 뒷자리로 80은 강사님이 쓰고 있음<br>

목표 공지페이지 > 시간남으면 상세정보(비밀번호, 이메일등)수정페이지<br>

#0426<br>

Security, 카톡연동 그래들에서 주석처리 하고 clean할것<br>

★ @TestPropertySource는 application-test.properties사용안할거면 아예선언안해야한다 <br>

 모두 출력하고 싶으면 Repository.findAll()<br>

★★★★★★ 로그인하고 error페이지로 이동하는거 물어보기<br>


#0429

jpa를 안쓰는 회사가 많아진다.
개인프로젝트는 spring 
join, subquery 사용할줄 알아야한다.

aws에 스프링 프로젝트 -> 클라우드에 옮길것<br>

클라우드 서버 게시한 것을 목표<br>


클라우드서버 조별로 비밀번호 바꾸기<br>



웹 실행시 table missing오류 발생하<br>
spring.jpa.hibernate.ddl-auto=update 로 수정할것<br>
평소에 무조건 update이어야한다.<br>

${item.itemSellStatus == T(com.shop.constant.ItemSellStatus).SELL} <br>
com.shop인지 org.zerock인지 확실히 입력할것<br>

admin/new, update 에서 에러 팝업 발생할 경우 db에서 item만 생성되고 item_img는 추가안되면<br>
이미지 경로에 폴더가 없어서 그렇다. c/shop/item<br>

★ notice_deail png오류 ./img를  ../img로 바꿔줘야한다.<br>

★th:field ="*{ntitle}"같은거 
"*{nTitle}" 빨간줄이어도 정상작동된다. 오히려 *{noticeFormDto.nTitle}가 작동안됨<br>
html에서 빨간줄 떠도 작동 되면 신경쓰지말것<br>


# 0502

567월이 취업타이밍<br>

이력서 ppt로 작성하여 보내기<br>
김효곤 취업 팀장<br>
팀원 한소연<br>
T 031-253-5995<br>
H010-5099-1463<br>
F.070-8611-9616<br>
E-mail. ssdgon@naver.com<br>


다시 shop프로젝트 형식으로 되돌림<br>
#notice crud 페이지완성<br>
notice/list에서 read,modify로 이동할경우 keyword가져갈수있게 작업해야한다.<br>

공유폴더 ogoods 참고하기<br>

★조회수 NoticeService.java에서 (readOnly=true)로 선언해서 조회수 추가안되서 애먹음<br>

#0503

일단은 다 붙이기
시험 두과목씩 보아야함 spring, boot, c , phyton ,git 시간 나는대로 만들어서줘

파이썬 정답 조원들끼리 이거는 하나씩 만들어보자 금요일

★ redirectAttributes : 간단하게 설명하면 Post후 어디느 페이지로 이동할 것인지
★ th:formaction="@{'/notice/modify/' + ${noticeFormDto.nno} }"  controller.java의 경로
★ javascript에서 nno가 controller로 전달이 안된다.



★포스트 맨 API사용할것
★ NoticeService.java의 remove메소드에서 deleteById(nno)사용해도 된다.
★ controller에서 @Valid, @PathVariable("nno") Long nno 로 매개변수선언해야 javascript에서 url받아올수 있다.
★ Dto.java에서 int대신 Integer 쓰는 이유 : 가볍게 객체화하려고

########   작업 #######

https://fmflowermall.com/goods/goods_detail/prd_code/dbc188b6eb/cname/6r2D67CU6rWs64uI#goods_detail_tab5
상품평, 이용후기
게시판 내가 다하기: 문의게시판 리뷰게시판, 이벤트페이지
가격의 할인, 쿠폰 해보기, 설문조사에 참여하면 5000원 포인트 준다던지, 퀴즈

해야할일 member계정 간단하게 만들고 ItemReview와 ItemReviewImg를 연결한다.(는 static으로 관리하기)


#0506<br>
★ SecurityConfig.java에서 .requestMatchers로 선언한 경로만 로그인안하고 집입할 수 있다.<br>
다른 경로는 로그인하고 나서 페이지 진입할 수있다.<br>

register. 공백시 에러팝업 만들것<br>
특이사항 평점 별
그냥 드롭다운가지고 5점 인지 입력하자

게시판 생성시 로그인된 정보 join하기

css새로 작성해야 한다.

#0506
★ @NotBlank와 @NotEmpty 어노테이션은 문자열(String) 필드에만 적용가능하고, Integer 필드에는 @NotNull을 사용해야 한다!<br>

★ 파일업로드 @Value("location")은 application.properties에서 경로설정해준다.<br>
itemReviewImgLocation=C:/shop/itemReview<br>
@Value("${}")사용하려면 import org.springframework.beans.factory.annotation.Value; 로 선언해야 한다.<br>

나중에 수정해야 할것 @Value($)경로, <br>
파일 병합시 주의해야할점 <br>
file업로드 경로<br>


#0507<br>
itemReview/list만들기<br>

시작시 root에서 flowerdb만들기<br>

★ Access denied for user 'floweruser'@'localhost'<br>
에러발생하면 하이디에서 db, 사용자계정 만들기<br>

일단 view도 추가하기<br>

댓글도 리스트 만들고 나중에 추가<br>

★ Project > Diagrams클릭하면 table나온다<br>

board.css파일 만들어서 헤더에 추가함<br>

템플릿사용<br>
이미지파일 get사용하려면 images/에 이미지 있어야한다. update만들기<br>


#0509<br>
첨부파일<br>
파일업로드 보류, 평점입력하기<br>


Notice list코드 한줄 수정 pageList 변수 못만들어서 수정<br>

깃에 코드많이 올리기<br>
자바 11버전과 17버전의 차이<br>

★파일업로드 update할경우 id,rno 값 hidden으로 선언해줘야된다.<br>
★Post로 웹에서 값받아올떄 name=title, content제대로 입력해줘야한다.<br>
