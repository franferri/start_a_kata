#!/bin/bash

set -Eeuxo pipefail # https://vaneyckt.io/posts/safer_bash_scripts_with_set_euxo_pipefail/

export SCRIPT_PATH="$(
cd "$(dirname "$0")" >/dev/null 2>&1
pwd -P
)"

cd "$SCRIPT_PATH" || exit 1

# Initialize
############

export MAVEN_OPTS=-Xmx1024m

# Run
############

cd ..
./mvnw clean package -DskipTests -T 1C;
./mvnw exec:java -Dexec.mainClass="example.BankAccount";
