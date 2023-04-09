package sawant.mihir.simplemvc.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sawant.mihir.simplemvc.model.Product;

import java.io.IOException;


@WebServlet(name = "productServlet", value = "/")
public class ProductController extends HttpServlet {

    private DbController dbController;


    @Override
    public void init() throws ServletException {
        dbController = new DbController();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/product_page.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Product product = new Product();
        product.setName(req.getParameter("name"));
        product.setType(req.getParameter("type"));
        product.setCost(Double.parseDouble(req.getParameter("cost")));
        product.setQty(Float.parseFloat(req.getParameter("qty")));
        int i = dbController.addProduct(product);
        if(i > 0){
            req.setAttribute("name", product.getName());
            req.setAttribute("type", product.getType());
            req.setAttribute("cost", product.getCost());
            req.setAttribute("qty", product.getQty());
            RequestDispatcher reqDispatch = req.getRequestDispatcher("/show_details.jsp");
            reqDispatch.forward(req, resp);
        }


    }
}
