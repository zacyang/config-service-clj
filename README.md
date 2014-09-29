# config-service-clj

A Clojure library designed to provide configuration service in restful way.

## Usage
### use maven 
>lein pom
>import project

### run service
>start repl
>=> (use 'ring.adapter.jetty)
  => (use 'hello-world.core)
  => (run-jetty handler {:port 3000})

## Continuous Integration

[![Continuous Integration status](https://secure.travis-ci.org/michaelklishin/neocons.png)](https://travis-ci.org/zacyang/config-service-clj)


CI is hosted by [travis-ci.org](http://travis-ci.org)

##TODO
>add project to travis

## License

Copyright © 2014 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
