<!-- imports -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="d-flex mt-5">
    <div class="card-group text-center mx-auto">
        <c:choose>
            <c:when test="${ !empty sessionScope.USER_FEMALE_QUANTITY}">
                <div class="col-sm-6">
                    <div class="card bg-light border-info">
                        <div class="card-header bg-info">
                            <h5 class="card-title text-white">Femenino</h5>
                        </div>
                        <div class="card-body">
                            <i class="fas fa-female float-left text-info"></i>
                            <p class="user-quantity font-weight-bold"><c:out value="${USER_FEMALE_QUANTITY}"/></p>
                            <p class="card-text text-muted">usuarios del género femenino registrados en la aplicación</p>
                        </div>
                    </div>
                </div>
            </c:when>
        </c:choose>
        <c:choose>
            <c:when test="${ !empty sessionScope.USER_MALE_QUANTITY}">
                <div class="col-sm-6">
                    <div class="card bg-light border-info">
                        <div class="card-header bg-info">
                            <h5 class="card-title text-white">Masculino</h5>
                        </div>
                        <div class="card-body">
                            <i class="fas fa-male float-left text-info"></i>
                            <p class="user-quantity font-weight-bold"><c:out value="${USER_MALE_QUANTITY}"/></p>
                            <p class="card-text text-muted">usuarios del género masculino registrados en la aplicación</p>
                        </div>
                    </div>
                </div>
            </c:when>
        </c:choose>
    </div>
</div>

