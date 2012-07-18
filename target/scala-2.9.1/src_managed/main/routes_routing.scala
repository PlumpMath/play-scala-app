// @SOURCE:D:/m22135/play/app.ws/prod-issues/conf/routes
// @HASH:fa3e87eb43384488dd051b4ab194a1c82c71bb81
// @DATE:Tue Jul 17 16:16:53 CEST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:9
val controllers_CategoryController_categories1 = Route("GET", PathPattern(List(StaticPart("/category"))))
                    

// @LINE:10
val controllers_CategoryController_edit2 = Route("GET", PathPattern(List(StaticPart("/u/category/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:11
val controllers_CategoryController_update3 = Route("POST", PathPattern(List(StaticPart("/u/category/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:12
val controllers_CategoryController_create4 = Route("GET", PathPattern(List(StaticPart("/a/category"))))
                    

// @LINE:13
val controllers_CategoryController_save5 = Route("POST", PathPattern(List(StaticPart("/a/category"))))
                    

// @LINE:16
val controllers_IssueController_issues6 = Route("GET", PathPattern(List(StaticPart("/issue"))))
                    

// @LINE:17
val controllers_IssueController_edit7 = Route("GET", PathPattern(List(StaticPart("/u/issue/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:18
val controllers_IssueController_update8 = Route("POST", PathPattern(List(StaticPart("/u/issue/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:19
val controllers_IssueController_create9 = Route("GET", PathPattern(List(StaticPart("/a/issue"))))
                    

// @LINE:20
val controllers_IssueController_save10 = Route("POST", PathPattern(List(StaticPart("/a/issue"))))
                    

// @LINE:22
val controllers_IssueController_get_search11 = Route("GET", PathPattern(List(StaticPart("/search"))))
                    

// @LINE:23
val controllers_IssueController_search12 = Route("POST", PathPattern(List(StaticPart("/search"))))
                    

// @LINE:27
val controllers_Assets_at13 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index"""),("""GET""","""/category""","""controllers.CategoryController.categories"""),("""GET""","""/u/category/$id<[^/]+>""","""controllers.CategoryController.edit(id:Long)"""),("""POST""","""/u/category/$id<[^/]+>""","""controllers.CategoryController.update(id:Long)"""),("""GET""","""/a/category""","""controllers.CategoryController.create"""),("""POST""","""/a/category""","""controllers.CategoryController.save"""),("""GET""","""/issue""","""controllers.IssueController.issues"""),("""GET""","""/u/issue/$id<[^/]+>""","""controllers.IssueController.edit(id:Long)"""),("""POST""","""/u/issue/$id<[^/]+>""","""controllers.IssueController.update(id:Long)"""),("""GET""","""/a/issue""","""controllers.IssueController.create"""),("""POST""","""/a/issue""","""controllers.IssueController.save"""),("""GET""","""/search""","""controllers.IssueController.get_search"""),("""POST""","""/search""","""controllers.IssueController.search"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:9
case controllers_CategoryController_categories1(params) => {
   call { 
        invokeHandler(_root_.controllers.CategoryController.categories, HandlerDef(this, "controllers.CategoryController", "categories", Nil))
   }
}
                    

// @LINE:10
case controllers_CategoryController_edit2(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.CategoryController.edit(id), HandlerDef(this, "controllers.CategoryController", "edit", Seq(classOf[Long])))
   }
}
                    

// @LINE:11
case controllers_CategoryController_update3(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.CategoryController.update(id), HandlerDef(this, "controllers.CategoryController", "update", Seq(classOf[Long])))
   }
}
                    

// @LINE:12
case controllers_CategoryController_create4(params) => {
   call { 
        invokeHandler(_root_.controllers.CategoryController.create, HandlerDef(this, "controllers.CategoryController", "create", Nil))
   }
}
                    

// @LINE:13
case controllers_CategoryController_save5(params) => {
   call { 
        invokeHandler(_root_.controllers.CategoryController.save, HandlerDef(this, "controllers.CategoryController", "save", Nil))
   }
}
                    

// @LINE:16
case controllers_IssueController_issues6(params) => {
   call { 
        invokeHandler(_root_.controllers.IssueController.issues, HandlerDef(this, "controllers.IssueController", "issues", Nil))
   }
}
                    

// @LINE:17
case controllers_IssueController_edit7(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.IssueController.edit(id), HandlerDef(this, "controllers.IssueController", "edit", Seq(classOf[Long])))
   }
}
                    

// @LINE:18
case controllers_IssueController_update8(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.IssueController.update(id), HandlerDef(this, "controllers.IssueController", "update", Seq(classOf[Long])))
   }
}
                    

// @LINE:19
case controllers_IssueController_create9(params) => {
   call { 
        invokeHandler(_root_.controllers.IssueController.create, HandlerDef(this, "controllers.IssueController", "create", Nil))
   }
}
                    

// @LINE:20
case controllers_IssueController_save10(params) => {
   call { 
        invokeHandler(_root_.controllers.IssueController.save, HandlerDef(this, "controllers.IssueController", "save", Nil))
   }
}
                    

// @LINE:22
case controllers_IssueController_get_search11(params) => {
   call { 
        invokeHandler(_root_.controllers.IssueController.get_search, HandlerDef(this, "controllers.IssueController", "get_search", Nil))
   }
}
                    

// @LINE:23
case controllers_IssueController_search12(params) => {
   call { 
        invokeHandler(_root_.controllers.IssueController.search, HandlerDef(this, "controllers.IssueController", "search", Nil))
   }
}
                    

// @LINE:27
case controllers_Assets_at13(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                