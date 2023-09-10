$(document).ready(function() {
    $("a[name='linkRemoveDetail']").each(function(index) {
        $(this).click(function() {
            removeDetailSectionByIndex(index);
        });
    });

});
const checkboxes = document.querySelectorAll('.checkbox');
const hiddenInput = document.querySelector('.hidden-input');
// Thêm sự kiện change cho từng checkbox
checkboxes.forEach(function (checkbox) {
    checkbox.addEventListener('change', function () {
        // Kiểm tra từng checkbox và đặt giá trị dựa trên trạng thái checked
        if (this.checked) {
            // Nếu checkbox được chọn, xóa dòng input hidden
            hiddenInput.remove();
        }
    });
});

function addNextAnswerSection() {
    allDivDetails = $("[id^='divDetail']");
    divDetailsCount = allDivDetails.length;

    htmlAnswerSection = `
        <div class="form-group row" 
        id="divDetail${divDetailsCount}">
            <input type="hidden" name="answerIDs" value="0"/>

            <label for="answer" class="col-sm-1 col-form-label">Answer:</label>
            <div class="col-sm-7">
                <input type="text" class="form-control" name="answerContents" maxlength="255" id="answer"/>
            </div>

            <label for="true" class="col-sm-1 col-form-label">True:</label>
            <div class="col-sm-2">
                <input type="checkbox" class="form-control w-25 checkbox" name="answerCorrects" maxlength="255" value='1' id="true">
                <input type="hidden" class="hidden-input" name="answerCorrects" value='0' id="true">
            </div>
        </div>
    `;

    $("#divQuestionAnswers").append(htmlAnswerSection);

    // Đính kèm sự kiện change cho checkbox trong phần tử mới
    const hiddenInput = document.querySelector('.hidden-input');
    const newCheckbox = $("#divDetail" + divDetailsCount).find('.checkbox');
    newCheckbox.on('change', function () {
        // Kiểm tra từng checkbox và đặt giá trị dựa trên trạng thái checked
        if (this.checked) {
            // Nếu checkbox được chọn, xóa dòng input hidden
            hiddenInput.remove();
        }
    });
}

function removeDetailSectionById(id) {
    $("#" + id).remove();
}

function removeDetailSectionByIndex(index) {
    $("#divDetail" + index).remove();
}
// Lấy tất cả các checkbox bằng class 'checkbox'
