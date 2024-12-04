function loadClients() {
    fetch('http://localhost:8080/client')
        .then(response => response.json())
        .then(data => {
            const tableBody = document.getElementById('clientTableBody');
            tableBody.innerHTML = '';

            data.forEach(client => {
                const row = document.createElement('tr');
                row.innerHTML = `
                    <td>${client.nameClient	}</td>
                    <td>${client.typeClient	}</td>
                    <td>${client.mail	}</td>
                    <td>${client.phone	}</td>
                    <td>${client.date}</td>
                    <td>
                        <button class="btn btn-VerDetallates" data-toggle="modal" data-target="#detailsModal"
                                onclick="showDetails('${client.nameClient}', '${client.typeClient}', '${client.mail}', '${client.phone}', '${client.date}')">
                            Ver Detalles
                        </button>
                    </td>
                `;
                tableBody.appendChild(row);
            });
        })
        .catch(error => {
            console.error('Error al cargar los clientes:', error);
        });
}

// Llamar a la función para cargar los datos al cargar la página
window.onload = loadClients;

// Función para cambiar el tipo de cliente a VIP
function toggleVip() {
    const button = document.getElementById('toggleVipButton');
    const idCliente = button.getAttribute('data-id');

    if (!idCliente) {
        console.error("No se encontró el ID del cliente.");
        return;
    }

    // Realizar la solicitud PUT
    fetch(`http://localhost:8080/client/${idCliente}/type?newType=VIP`, {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json',
            },
        })
        .then(response => {
            if (response.ok) {
                // Actualizar el tipo en el modal
                document.getElementById('detailType').innerText = 'VIP';
                alert('El cliente ha sido actualizado a VIP.');
            } else {
                alert('Error al actualizar el cliente.');
            }
        })
        .catch(error => {
            console.error('Error en la solicitud:', error);
        });
}

// Event Listener para el botón "Cambiar a VIP"
document.getElementById('toggleVipButton').addEventListener('click', toggleVip);