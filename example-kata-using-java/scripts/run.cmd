SET SCRIPT_PATH=%~dp0
cd %SCRIPT_PATH%
cd ..

SET MAVEN_OPTS=-Xmx1024m

cd ..
mvnw clean package -DskipTests -T 1C;
mvnw exec:java -Dexec.mainClass="example.BankAccount";
