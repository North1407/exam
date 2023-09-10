$(document).ready(function() {
    $("a[name='linkRemoveDetail']").each(function(index) {
        $(this).click(function() {
            removeDetailSectionByIndex(index);
        });
    });

});
const checkboxes = document.querySelectorAll('.checkbox');
checkboxes.forEach(function (checkbox) {
    checkbox.addEventListener('change', function () {
        // Lấy id của checkbox đang thay đổi
        const checkboxId = this.id;

        // Tạo id của input hidden tương ứng
        const hiddenInputId = `hidden-${checkboxId}`;

        // Tìm input hidden bằng id và xóa nó nếu checkbox được chọn
        const hiddenInput = document.getElementById(hiddenInputId);
        if (this.checked) {
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

            <label class="col-sm-1 col-form-label">True:</label>
            <div class="col-sm-2">
                <input type="checkbox" class="form-control w-25 checkbox" name="answerCorrects" maxlength="255" value='1' id="${divDetailsCount}">
                <input type="hidden" id="hidden-${divDetailsCount}" name="answerCorrects" value='0'>
            </div>
        </div>
    `;

    $("#divQuestionAnswers").append(htmlAnswerSection);

    // Đính kèm sự kiện change cho checkbox trong phần tử mới

    const newCheckbox = $("#divDetail" + divDetailsCount).find('.checkbox');
    newCheckbox.on('change', function () {
        const checkboxId = this.id;
        const hiddenInputId = `hidden-${checkboxId}`;
        const hiddenInput = document.getElementById(hiddenInputId);
        if (this.checked) {
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
