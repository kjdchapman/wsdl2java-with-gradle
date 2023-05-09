# Generate Java from WSDL

Take in WSDL and create Java classes representing a web service! All you need is this handy script. And some WSDL. And the understanding of what those classes actually are (that's a work-in-progress for us).

Much of this was built using the [documentation for the cxf-codegen plugin](https://ciscoo.github.io/cxf-codegen-gradle/docs/current/user-guide/) it's using.

Note that that plugin in turn is using [wsdl2java, so some of their documentation](https://cxf.apache.org/docs/wsdl-to-java.html) may also be relevant (for example, if you want to change its behaviour slightly).

You can see some example output in [this other repository](https://github.com/kjdchapman/generated-java).

## Running the script

`./gradle generate`

## Changing the behaviour of the script

If you want a different output directory (and maybe some other things we'll want to tweak!), look at the `tasks.register` block in `build.grade.kts`.