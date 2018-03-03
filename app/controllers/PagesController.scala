package controllers

import javax.inject.{Inject, Singleton}

import play.api.mvc.{AbstractController, ControllerComponents}

@Singleton
class PagesController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def contact = Action {
    Ok(views.html.contact())
  }

  /** About menu items */
  def about = Action {
    Ok(views.html.about())
  }

  /** Products & Services menu items */
  def products = Action {
    Ok(views.html.products())
  }

  def quote = Action {
    Ok(views.html.quote())
  }

  def upload = Action {
    Ok(views.html.upload())
  }

  /** Pages not on nav-bar items */
  def faq = Action {
    Ok(views.html.faq())
  }

  def portfolio = Action {
    Ok(views.html.portfolio())
  }

  def career = Action {
    Ok(views.html.careers())
  }


}