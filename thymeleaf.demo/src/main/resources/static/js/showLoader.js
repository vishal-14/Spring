function showImage(formData)
{
    var res= $.ajax({
        method: "POST",
        url: "/registrationSubmit",
        data: formData,
        success: function (data) {
            console.log(data)
            $("#LoadingImage").hide();
            $("#response").append("Response "+data);
            console.log("Successful Registration");
        },
        error: function (xhr, status) {
            $("#LoadingImage").hide();
            alert('Unknown error ' + status);
        }
    });
}