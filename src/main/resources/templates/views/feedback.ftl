<#-- @ftlvariable name="_csrf" type="org.springframework.security.web.csrf.CsrfToken" -->
<#import "/spring.ftl" as spring>

<div id="feedback" class="toast toast-modal hide" role="alert" aria-live="assertive" aria-atomic="true">
    <div class="toast-header">
        <strong class="mr-auto">Request feedback</strong>
        <button type="button" class="ml-2 mb-1 close" data-dismiss="toast" aria-label="Close">
            <span aria-hidden="true">&times;</span>
        </button>
    </div>
    <div class="toast-body">
        <form action="/request/feedback" method="post">
            <input type="text" name="request" id="request-id" hidden>
            <input type="hidden" name="_csrf" value="${_csrf.token}">
            <div class="form-group">
                <label for="feedback-title">Title</label>
                <input type="text" class="form-control" id="feedback-title" value="" disabled>
            </div>

            <div class="form-group">
                <label for="title">Rate</label>
                <div class="feedback-rate risingstar d-flex justify-content-center flex-row-reverse">
                    <input type="radio" id="star5" name="grade" value="5"/>
                    <label for="star5" title="5 star">
                        <i class="fas fa-star"></i>
                    </label>

                    <input type="radio" id="star4" name="grade" value="4"/>
                    <label for="star4" title="4 star">
                        <i class="fas fa-star"></i>
                    </label>

                    <input type="radio" id="star3" name="grade" value="3"/>
                    <label for="star3" title="3 star">
                        <i class="fas fa-star"></i>
                    </label>

                    <input type="radio" id="star2" name="grade" value="2"/>
                    <label for="star2" title="2 star">
                        <i class="fas fa-star"></i>
                    </label>

                    <input type="radio" id="star1" name="grade" value="1"/>
                    <label for="star1" title="1 star">
                        <i class="fas fa-star"></i>
                    </label>
                </div>
            </div>

            <div class="form-group">
                <label for="comment">Comment</label>
                <textarea name="message" class="form-control" id="comment" rows="3"></textarea>
            </div>

            <button type="submit" class="btn btn-primary">Send</button>
        </form>
    </div>
</div>