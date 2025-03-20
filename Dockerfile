# ✅ JBoss EAP 7.4 + OpenJDK 17 공식 이미지 사용
FROM default-route-openshift-image-registry.apps.ext2.mtp.local/registry/eap74-openjdk17-openshift-rhel8:latest

# ✅ 작업 디렉토리 설정
WORKDIR /opt/eap/standalone/deployments/

# ✅ qwer.war 파일을 JBoss 배포 폴더로 복사
COPY target/qwer.war .

# ✅ 배포 마커 파일 추가 (JBoss가 WAR 파일을 자동 배포하도록 설정)
RUN touch qwer.war.dodeploy

# ✅ JBoss EAP를 포어그라운드 모드로 실행
CMD ["/opt/eap/bin/standalone.sh", "-b", "0.0.0.0"]
