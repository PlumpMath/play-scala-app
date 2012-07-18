// @SOURCE:D:/m22135/play/app.ws/prod-issues/conf/routes
// @HASH:fa3e87eb43384488dd051b4ab194a1c82c71bb81
// @DATE:Tue Jul 17 16:16:53 CEST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:27
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseCategoryController {
    


 
// @LINE:12
def create() = {
   Call("GET", "/a/category")
}
                                                        
 
// @LINE:11
def update(id:Long) = {
   Call("POST", "/u/category/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:13
def save() = {
   Call("POST", "/a/category")
}
                                                        
 
// @LINE:10
def edit(id:Long) = {
   Call("GET", "/u/category/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:9
def categories() = {
   Call("GET", "/category")
}
                                                        

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        

                      
    
}
                            

// @LINE:27
class ReverseAssets {
    


 
// @LINE:27
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            

// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
class ReverseIssueController {
    


 
// @LINE:16
def issues() = {
   Call("GET", "/issue")
}
                                                        
 
// @LINE:19
def create() = {
   Call("GET", "/a/issue")
}
                                                        
 
// @LINE:18
def update(id:Long) = {
   Call("POST", "/u/issue/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:20
def save() = {
   Call("POST", "/a/issue")
}
                                                        
 
// @LINE:23
def search() = {
   Call("POST", "/search")
}
                                                        
 
// @LINE:17
def edit(id:Long) = {
   Call("GET", "/u/issue/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:22
def get_search() = {
   Call("GET", "/search")
}
                                                        

                      
    
}
                            
}
                    


// @LINE:27
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseCategoryController {
    


 
// @LINE:12
def create = JavascriptReverseRoute(
   "controllers.CategoryController.create",
   """
      function() {
      return _wA({method:"GET", url:"/a/category"})
      }
   """
)
                                                        
 
// @LINE:11
def update = JavascriptReverseRoute(
   "controllers.CategoryController.update",
   """
      function(id) {
      return _wA({method:"POST", url:"/u/category/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:13
def save = JavascriptReverseRoute(
   "controllers.CategoryController.save",
   """
      function() {
      return _wA({method:"POST", url:"/a/category"})
      }
   """
)
                                                        
 
// @LINE:10
def edit = JavascriptReverseRoute(
   "controllers.CategoryController.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"/u/category/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:9
def categories = JavascriptReverseRoute(
   "controllers.CategoryController.categories",
   """
      function() {
      return _wA({method:"GET", url:"/category"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:27
class ReverseAssets {
    


 
// @LINE:27
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
class ReverseIssueController {
    


 
// @LINE:16
def issues = JavascriptReverseRoute(
   "controllers.IssueController.issues",
   """
      function() {
      return _wA({method:"GET", url:"/issue"})
      }
   """
)
                                                        
 
// @LINE:19
def create = JavascriptReverseRoute(
   "controllers.IssueController.create",
   """
      function() {
      return _wA({method:"GET", url:"/a/issue"})
      }
   """
)
                                                        
 
// @LINE:18
def update = JavascriptReverseRoute(
   "controllers.IssueController.update",
   """
      function(id) {
      return _wA({method:"POST", url:"/u/issue/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:20
def save = JavascriptReverseRoute(
   "controllers.IssueController.save",
   """
      function() {
      return _wA({method:"POST", url:"/a/issue"})
      }
   """
)
                                                        
 
// @LINE:23
def search = JavascriptReverseRoute(
   "controllers.IssueController.search",
   """
      function() {
      return _wA({method:"POST", url:"/search"})
      }
   """
)
                                                        
 
// @LINE:17
def edit = JavascriptReverseRoute(
   "controllers.IssueController.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"/u/issue/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:22
def get_search = JavascriptReverseRoute(
   "controllers.IssueController.get_search",
   """
      function() {
      return _wA({method:"GET", url:"/search"})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:27
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseCategoryController {
    


 
// @LINE:12
def create() = new play.api.mvc.HandlerRef(
   controllers.CategoryController.create(), HandlerDef(this, "controllers.CategoryController", "create", Seq())
)
                              
 
// @LINE:11
def update(id:Long) = new play.api.mvc.HandlerRef(
   controllers.CategoryController.update(id), HandlerDef(this, "controllers.CategoryController", "update", Seq(classOf[Long]))
)
                              
 
// @LINE:13
def save() = new play.api.mvc.HandlerRef(
   controllers.CategoryController.save(), HandlerDef(this, "controllers.CategoryController", "save", Seq())
)
                              
 
// @LINE:10
def edit(id:Long) = new play.api.mvc.HandlerRef(
   controllers.CategoryController.edit(id), HandlerDef(this, "controllers.CategoryController", "edit", Seq(classOf[Long]))
)
                              
 
// @LINE:9
def categories() = new play.api.mvc.HandlerRef(
   controllers.CategoryController.categories(), HandlerDef(this, "controllers.CategoryController", "categories", Seq())
)
                              

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:27
class ReverseAssets {
    


 
// @LINE:27
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            

// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
class ReverseIssueController {
    


 
// @LINE:16
def issues() = new play.api.mvc.HandlerRef(
   controllers.IssueController.issues(), HandlerDef(this, "controllers.IssueController", "issues", Seq())
)
                              
 
// @LINE:19
def create() = new play.api.mvc.HandlerRef(
   controllers.IssueController.create(), HandlerDef(this, "controllers.IssueController", "create", Seq())
)
                              
 
// @LINE:18
def update(id:Long) = new play.api.mvc.HandlerRef(
   controllers.IssueController.update(id), HandlerDef(this, "controllers.IssueController", "update", Seq(classOf[Long]))
)
                              
 
// @LINE:20
def save() = new play.api.mvc.HandlerRef(
   controllers.IssueController.save(), HandlerDef(this, "controllers.IssueController", "save", Seq())
)
                              
 
// @LINE:23
def search() = new play.api.mvc.HandlerRef(
   controllers.IssueController.search(), HandlerDef(this, "controllers.IssueController", "search", Seq())
)
                              
 
// @LINE:17
def edit(id:Long) = new play.api.mvc.HandlerRef(
   controllers.IssueController.edit(id), HandlerDef(this, "controllers.IssueController", "edit", Seq(classOf[Long]))
)
                              
 
// @LINE:22
def get_search() = new play.api.mvc.HandlerRef(
   controllers.IssueController.get_search(), HandlerDef(this, "controllers.IssueController", "get_search", Seq())
)
                              

                      
    
}
                            
}
                    
                