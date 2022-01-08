#!/bin/bash

set -Eeuxo pipefail # https://vaneyckt.io/posts/safer_bash_scripts_with_set_euxo_pipefail/

export SCRIPT_PATH="$(
cd "$(dirname "$0")" >/dev/null 2>&1
pwd -P
)"

cd "$SCRIPT_PATH" || exit 1
cd ..

# Initialize
############

echo RUNNING TESTS IN PARALLEL, MIND IF THEY HAVE STATE

mvnw test -T 1C

