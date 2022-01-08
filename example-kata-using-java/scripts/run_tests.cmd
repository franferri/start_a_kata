SET SCRIPT_PATH=%~dp0
cd %SCRIPT_PATH%
cd ..

SET MAVEN_OPTS=-Xmx1024m

mvnw test -T 1C

