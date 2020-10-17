Contact Us 페이지란?

고객들이 회사 제품에 불만/문의사항이 있을 때 회사 홈페이지의 Contact Us 페이지에서 문의를 할 수 있도록 하는 페이지

주요 구현 내용 요약
  1. VO(Contact.java)를 이용하여 view(home.jsp) 화면의 데이터를 Controller(HomeController.java)로 전송 구현
  2. Controller가 view에서 받은 데이터를 Service(ContactServiceImpl.java)로 전송 구현
  3. Service에서 받은 데이터를 DAO(ContactDaoImpl.java)로 전송 구현
  4. DAO와 Mapper(contactMapper.xml)의 연동 구현
  5. MYSQL DB 저장용 테이블 생성
  6. DB 저장을 위한 개발환경 설정(Spring + MyBatis + MySQL 설정)
  7. view 화면에 콤보박스 기능 추가/팝업창 기능 추가
  
[수정]기본 화면
![fix view](https://user-images.githubusercontent.com/64358371/96347632-f3db8980-10dd-11eb-8b10-65350c6709c8.jpg)
콤보박스 기능 추가
![fix view_combobox](https://user-images.githubusercontent.com/64358371/96347442-c0e4c600-10dc-11eb-97d4-77a004d5e54f.jpg)
팝업창 기능 추가
![fix view_popup](https://user-images.githubusercontent.com/64358371/96347444-c2ae8980-10dc-11eb-9f1f-c04b093d5685.jpg)
[수정]DB 저장
![fix DB_insert_sucess](https://user-images.githubusercontent.com/64358371/96347447-c510e380-10dc-11eb-86c5-7f85532de5cd.jpg)

