@extends('adminlte::page')

@section('title', 'ciudades')

@section('content_header')
    <h1>Gestion de ciudades</h1>
    <!-- Button trigger modal -->
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
  Agregar ciudad
</button>

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
       <form method="post" action="agregarciudad">
        @csrf
      <div class="modal-body">
        <input type="text" name="city">
        ...
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="submit" class="btn btn-primary">Guardar</button>
      </div>
</form>
    </div>
  </div>
</div>
@stop

@section('content')
   <p>Lista de ciudades<p>
    <table class="">
        <thead>
            <tr>
            <th>ID</th>
            <th>Ciudad</th>
            <th> - </th>
            </tr>
        </thead>
        <tbody>
        @foreach($ciudades as $c)
        <tr>
        <td>{{$c ->id}}</td>
        <td>{{$c ->nombre}}</td>
        <td>Editar</td>
        </tr>
        <tr>
        @endforeach
    </tbody>
    </table>  
    {{$ciudades->links()}}            
@stop

@section('css')
    {{-- Add here extra stylesheets --}}
    {{-- <link rel="stylesheet" href="/css/admin_custom.css"> --}}
@stop

@section('js')
    <script> console.log("Hi, I'm using the Laravel-AdminLTE package!"); </script>
@stop


