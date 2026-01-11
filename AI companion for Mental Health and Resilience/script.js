function sendMessage() {
    const msg = document.getElementById("message").value;

    fetch("http://localhost:8080/api/chat", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ message: msg })
    })
    .then(res => res.json())
    .then(data => {
        document.getElementById("response").innerHTML =
            `<p><b>Sentiment:</b> ${data.sentiment}</p>
             <p><b>AI:</b> ${data.reply}</p>`;
    });
}
