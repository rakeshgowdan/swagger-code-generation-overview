https://medium.com/@ankithahjpgowda/api-code-generation-using-swagger-in-springboot-e6b2fafc583c



## Under paths key, we need to specify all paths required to be generated. It need to have,

API endpoint — path with any path params involved within braces
HTTP method —the type of API i.e, get, put, post, delete, etc.
summary — description of the API
produces — format of the response
tag — tag for the API
responses — various response codes and their format
parameters — parameters involved, query param or path param
operationId — the name of the function to be generated


## If any model classes are required, like in case of request payload or response. In that case, we need to provide definitions for them as well with all parameters involved.

```
$ref: '#/definitions/myElement' # means go to the root of the current document and then find elements definitions and myElement one after one.
```

Note: If the parameter value is predefined, we can made them as enums in yaml file

Important note: (Importing the generated-sources to build path)
In Eclipse 4.9.0 (2018-09) I had to add the generated-sources folder as a source folder for the project like this:

open the "Navigator" view
browse to target/generated-sources (or whatever your folder for the generated sources is).
right-click on that folder
click "Build Path" -> "Use as Source Folder"


## Reference : https://medium.com/@ankithahjpgowda/api-code-generation-using-swagger-in-springboot-e6b2fafc583c
