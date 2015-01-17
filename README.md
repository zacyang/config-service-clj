# config-service-clj

A Clojure library designed to provide configuration service in restful way.

## Usage
### use maven 
 > lein pom
 > import project

### run service
 > lein ring server

## Continuous Integration

[![Continuous Integration status](https://travis-ci.org/zacyang/config-service-clj.svg?branch=master)](https://travis-ci.org/zacyang/config-service-clj)


CI is hosted by [travis-ci.org](http://travis-ci.org)

##TODO
 - add couchDB
 - [?] add swagger support / swagger UI
 - add json schema validation
 - add athentication
 - add user role, admin(r/w) role and dev(r) role
 - spike on how to test database repo
 - make repo configurable , so that test can use it's own repo
 - use stand-alone mode instead of rely on lein

## License

Copyright © 2014 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
