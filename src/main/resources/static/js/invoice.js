$(document).ready(function(){
	
	// start edit button
	$('table #edit_iv').on('click',function(e){
		e.preventDefault();
		
		var href = $(this).attr('href');
		
		$.get(href, function(data, status){
			$('#id').val(data.id);
			var dateFacture = data.dateinvoice.substr(0,10);
			$('#DateFacture').val(dateFacture);
			$('#clientEdit').val(data.clientid);
			$('#statFacture').val(data.invoicestatusid);
			$('#Remarks').val(data.remarks);
		});
		$('#editModal').modal();
	});
	// end edit button
	
	// start delete button
	$('table #delete_iv').on('click', function(e){
		e.preventDefault();
		
		var href = $(this).attr('href');
		$('#confirmDelete').attr('href', href);
		$('#deleteModal').modal();
	});
	// end delete button
});