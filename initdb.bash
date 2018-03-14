#!/bin/bash

BOOKDB_POD=`kubectl get pod -n bookshelf-system | grep ^book-db | cut -d' ' -f 1`
echo $BOOKDB_POD

kubectl exec -it $BOOKDB_POD -n bookshelf-system /bin/bash
psql -n book -U postgres




BOOKSHELFDB_POD=`kubectl get pod -n bookshelf-system | grep ^bookshelf-db | cut -d' ' -f 1`
echo $BOOKSHELFDB_POD

kubectl exec -it $BOOKSHELFDB_POD -n bookshelf-system /bin/bash
psql -n bookshelf -U postgres
